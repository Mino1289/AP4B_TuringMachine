package com.turingmachine.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.turingmachine.core.CriteriaCard;
import com.turingmachine.core.Player;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


public class CriteriaCardSelectionController implements Initializable {

    @FXML
    private AnchorPane myPane;
    // TODO: Add a GridPane to the FXML file and use it to display the cards
    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        Singleton singleton = Singleton.getInstance();
        int ptp = singleton.getPlayerToPlay();
        Player currentPlayer = singleton.getPlayers().get(ptp);
        Label usernameLabel = new Label(currentPlayer.getUsername() + "  " + currentPlayer.getTestCount());
        Label punchCardLabel = new Label(currentPlayer.getPunchCard().toString());

        usernameLabel.setLayoutX(150);
        usernameLabel.setLayoutY(150);
        punchCardLabel.setLayoutX(175);
        punchCardLabel.setLayoutY(175);
        myPane.getChildren().addAll(usernameLabel, punchCardLabel);

        GridPane mygpane = new GridPane();
        int i = 0;
        ArrayList<CriteriaCard> critCards = singleton.getGame().getProblem().getCriterias();
        System.out.println(critCards.size());
        for (CriteriaCard critCard : critCards) {
            // System.out.println(critCard.getId());
            ImageView selectedImage = new ImageView();
            Image critImage = new Image(CriteriaCardSelectionController.class.getResource("imgs/" + critCard.getId() + ".png").toString());
            selectedImage.setImage(critImage);
            selectedImage.setPreserveRatio(true);
            selectedImage.setFitWidth(200);
            selectedImage.setFitHeight(200);

            selectedImage.setOnMouseClicked(e -> {
                if (singleton.canCheckAnotherCriteria()) {
                    // System.out.println(critCard.getId() + "   " + critCard.getIdx());
                    boolean answer = critCard.verify(currentPlayer.getPunchCard());
                  
                    singleton.decrementTestCounter();
                    singleton.getPlayers().get(ptp).incrementTestCount();
                    selectedImage.setOnMouseClicked(null);
                    selectedImage.setStyle("-fx-opacity: 0.5");
                    ImageView resultImageView = new ImageView();
                    Image resultImage = new Image(CriteriaCardSelectionController.class.getResource((answer ? "true.png" : "false.png")).toString());
                    resultImageView.setImage(resultImage);
                    resultImageView.setPreserveRatio(true);
                    resultImageView.setFitWidth(32);
                    resultImageView.setFitHeight(32);
                    resultImageView.setX(selectedImage.getLayoutX() + 75);
                    resultImageView.setY(selectedImage.getLayoutY() + 250);
                    this.myPane.getChildren().add(resultImageView);
                }
            });
            mygpane.add(selectedImage, critCards.size() > 4 ? (i >= 3 ? i-3 : i) : i,  critCards.size() > 4 && i >= 3 ? 1 : 0);
            i++;
        }
        mygpane.setLayoutX(25);
        mygpane.setLayoutY(0);

        this.myPane.getChildren().addAll(mygpane);
        System.out.println("CriteriaCardSelectionController initialized");
    }

    @FXML
    public void next() throws IOException {
        Singleton singleton = Singleton.getInstance();
        if (singleton.sameManche()) {
            // dans la même manche
            singleton.nextPlayer();
            TuringMachine.setRoot("punchcard-selection");
        } else {
            // on change de manche
            TuringMachine.setRoot("validate-screen");
        }
    }

}
