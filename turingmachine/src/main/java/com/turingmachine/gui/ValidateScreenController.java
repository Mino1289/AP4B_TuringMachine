package com.turingmachine.gui;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
        System.out.println("ValidateScreen started initalize");
        GridPane myGridPane = new GridPane();
        Singleton singleton = Singleton.getInstance();
        
        int i = 1;
        for (Player player : singleton.getPlayers()) {
            Label pLabel = new Label(player.getUsername());
            Button pButton = new Button("J'ai trouvé !");
            pButton.setOnMouseClicked(e -> {
                pButton.setOnMouseClicked(null);
                singleton.setPlayerFini(player);
            });
            myGridPane.add(pLabel, i, 0);
            myGridPane.add(pButton, i, 1);
            ++i;
        }

        myGridPane.setHgap(20);
        myGridPane.setVgap(20);
        myGridPane.setLayoutX(150);
        myGridPane.setLayoutY(150);
    
        myPane.getChildren().addAll(myGridPane);
        System.out.println("ValidateScreen initialized");
    }

    @FXML
    public void validate() throws IOException {
        if (Singleton.getInstance().getPlayerFini().size() == 0) {
            Singleton.getInstance().nextPlayer();
            TuringMachine.setRoot("punchcard-selection");
        } else {
            TuringMachine.setRoot("result-screen");
        }
    }
}
