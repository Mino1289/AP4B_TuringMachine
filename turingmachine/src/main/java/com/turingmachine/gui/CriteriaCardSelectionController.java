package com.turingmachine.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.turingmachine.core.CriteriaCard;
import com.turingmachine.core.Player;
import com.turingmachine.core.Game;

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
        Game game = Game.getInstance();
        int ptp = game.getPlayerToPlay();
        Player currentPlayer = game.getPlayers().get(ptp);
        Label usernameLabel = new Label("Username: "+currentPlayer.getUsername() + "  " + currentPlayer.getTestCount());
        Label punchCardLabel = new Label("Punchcard selected :"+currentPlayer.getPunchCard().toString());
        Label indicationLabel = new Label("PunchCard's order \n -> Blue | Yellow | Purple");

        indicationLabel.setLayoutX(25);
        indicationLabel.setLayoutY(200);
        usernameLabel.setLayoutX(25);
        usernameLabel.setLayoutY(150);
        punchCardLabel.setLayoutX(25);
        punchCardLabel.setLayoutY(290);
        myPane.getChildren().addAll(usernameLabel, punchCardLabel,indicationLabel);

        GridPane mygpane = new GridPane();
        int i = 0;
        ArrayList<CriteriaCard> critCards = game.getProblem().getCriterias();
        for (CriteriaCard critCard : critCards) {
            ImageView selectedImage = new ImageView();
            Image critImage = new Image(CriteriaCardSelectionController.class.getResource("imgs/" + critCard.getId() + ".png").toString());
            selectedImage.setImage(critImage);
            selectedImage.setPreserveRatio(true);
            selectedImage.setFitWidth(200);
            selectedImage.setFitHeight(200);

            selectedImage.setOnMouseClicked(e -> {
                if (currentPlayer.canCheckAnotherCriteria()) {
                    boolean answer = critCard.verify(currentPlayer.getPunchCard());
                  
                    currentPlayer.decrementCurrentTestCounter();
                    currentPlayer.incrementTestCount();
                    
                    selectedImage.setOnMouseClicked(null);
                    selectedImage.setStyle("-fx-opacity: 0.5");
                    ImageView resultImageView = new ImageView();
                    Image resultImage = new Image(CriteriaCardSelectionController.class.getResource((answer ? "true.png" : "false.png")).toString());
                    resultImageView.setImage(resultImage);
                    resultImageView.setPreserveRatio(true);
                    resultImageView.setFitWidth(32);
                    resultImageView.setFitHeight(32);
                    resultImageView.setX(selectedImage.getLayoutX() + 85);
                    resultImageView.setY(selectedImage.getLayoutY() + 97);
                    this.myPane.getChildren().add(resultImageView);
                }
            });
            mygpane.add(selectedImage, critCards.size() >= 4 ? (i >= 3 ? i-3 : i) : i,  i >= 3 ? 1 : 0);
            i++;
        }
        mygpane.setLayoutX(0);
        mygpane.setLayoutY(0);

        this.myPane.getChildren().addAll(mygpane);
    }

    @FXML
    public void next() throws IOException {
        Game game = Game.getInstance();
        if (game.sameRound()) {
            // dans la même manche
            game.nextPlayer();
            TuringMachine.setRoot("punchcard-selection");
        } else {
            // on change de manche
            TuringMachine.setRoot("validate-screen");
        }
    }

}
