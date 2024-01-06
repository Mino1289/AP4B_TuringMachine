package com.turingmachine.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.turingmachine.core.CriteriaCard;
import com.turingmachine.core.Game;
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

public class ValidatePunchCardController implements Initializable {

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

        Game game = Game.getInstance();
        Player player = game.getPlayersTerminated().get(game.getPlayerToChoose());
        player.setPunchCard(new PunchCard(bValue, yValue, pValue));
        game.nextPlayerToChoose();
        if (game.getPlayerToChoose() >= game.getPlayersTerminated().size()) {
            TuringMachine.setRoot("result-screen");
        } else {
            TuringMachine.setRoot("validate-punchcard");
        }
    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        // create a Label with the username of the player
        Game game = Game.getInstance();

        Label usernameLabel = new Label(game.getPlayersTerminated().get(game.getPlayerToChoose()).getUsername());
        usernameLabel.setLayoutX(25);
        usernameLabel.setLayoutY(350);

        GridPane mygpane = new GridPane();
        int i = 0;
        ArrayList<CriteriaCard> critCards = game.getProblem().getCriterias();
        for (CriteriaCard critCard : critCards) {
            ImageView selectedImage = new ImageView();
            Image image = new Image(
                    ValidatePunchCardController.class.getResource("imgs/" + critCard.getId() + ".png").toString());
            selectedImage.setImage(image);
            selectedImage.setPreserveRatio(true);
            selectedImage.setFitWidth(250);
            mygpane.add(selectedImage, critCards.size() >= 4 ? (i >= 3 ? i-3 : i) : i,  i >= 3 ? 1 : 0);
            i++;
        }
        mygpane.setLayoutX(20);
        mygpane.setLayoutY(15);

        this.myPane.getChildren().addAll(mygpane, usernameLabel);

    }
}
