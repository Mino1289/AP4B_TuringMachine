package com.turingmachine.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.turingmachine.core.CriteriaCard;
import com.turingmachine.core.Player;
import com.turingmachine.core.PunchCard;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class PunchCardSelectionController implements Initializable {
    
    @FXML
    private Spinner<Integer> blue;
    @FXML
    private Spinner<Integer> yellow;
    @FXML
    private Spinner<Integer> purple;
    @FXML
    private AnchorPane myPane;

    @FXML
    private void validate() throws IOException {
        int bValue = blue.getValue();
        int yValue = yellow.getValue();
        int pValue = purple.getValue();


        Singleton singleton = Singleton.getInstance();
        Player player = singleton.getPlayers().get(singleton.getPlayerToPlay());
        player.setPunchCard(new PunchCard(bValue, yValue, pValue));
        // setCurrentPunchCard(bValue, yValue, pValue);
        TuringMachine.setRoot("criteria-card-selection");
    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        // create a Label with the username of the player
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getPlayerToPlay());
        for (Player player: singleton.getPlayers()) {
            System.out.println(player.getUsername());
        }

        Label usernameLabel = new Label(singleton.getPlayers().get(singleton.getPlayerToPlay()).getUsername());
        usernameLabel.setLayoutX(25);
        usernameLabel.setLayoutY(175);

        GridPane mygpane = new GridPane();
        int i = 0;
        ArrayList<CriteriaCard> critCards = singleton.getGame().getProblem().getCriterias();
        System.out.println(critCards.size());
        for (CriteriaCard critCard : critCards) {
            // System.out.println(critCard.getId());
            ImageView selectedImage = new ImageView();
            Image image = new Image(PunchCardSelectionController.class.getResource("imgs/" + critCard.getId() + ".png").toString());
            selectedImage.setImage(image);
            selectedImage.setPreserveRatio(true);
            selectedImage.setFitWidth(200);
            selectedImage.setFitHeight(200);
            // mygpane.add(selectedImage, i >= 3 ? i-3 : i, i >= 3 ? 1 : 0);
            mygpane.add(selectedImage, critCards.size() > 4 ? (i >= 3 ? i-3 : i) : i,  critCards.size() > 4 && i >= 3 ? 1 : 0);
            i++;
        }
        // mygpane.setLayoutX(25);
        mygpane.setLayoutY(25);

        this.myPane.getChildren().addAll(mygpane, usernameLabel);

        System.out.println("PunchCardSelectionController initialized");
    }
}
