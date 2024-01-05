package com.turingmachine.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.turingmachine.core.Game;
import com.turingmachine.core.Player;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class ValidateScreenController implements Initializable {
    @FXML
    private AnchorPane myPane;

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        GridPane myGridPane = new GridPane();
        Game game = Game.getInstance();

        int i = 1;
        for (Player player : game.getPlayers()) {
            Label pLabel = new Label("Username: "+ player.getUsername());
            Button pButton = new Button("Je pense avoir trouvé");
            pButton.setOnMouseClicked(e -> {
                pButton.setOnMouseClicked(null);
                game.setPlayerTerminated(player);
                pButton.setText("J'ai trouvé !");
            });
            myGridPane.add(pLabel, i, 0);
            myGridPane.add(pButton, i, 1);
            ++i;
        }

        myGridPane.setHgap(20);
        myGridPane.setVgap(20);
        myGridPane.setLayoutX(0);
        myGridPane.setLayoutY(150);

        myPane.getChildren().addAll(myGridPane);
    }

    @FXML
    public void validate() throws IOException {
        if (Game.getInstance().getPlayersTerminated().size() == 0) {
            Game.getInstance().nextPlayer();
            TuringMachine.setRoot("punchcard-selection");
        } else {
            TuringMachine.setRoot("validate-punchcard");
        }
    }
}
