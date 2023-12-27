package com.turingmachine.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.turingmachine.core.Player;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class UsernameController implements Initializable {
    @FXML
    private AnchorPane myPane;
    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        Singleton singleton = Singleton.getInstance();
        GridPane gPane = new GridPane();

        System.out.println("username ctrler nplayer : " + singleton.getNumberOfPlayers());
        for (int i = 0; i < singleton.getNumberOfPlayers(); i++) {
            TextField tf = new TextField();
            tf.setStyle("-fx-border-color: black ; -fx-border-width: 2px ;");
            gPane.addRow(i, tf);
            singleton.addUsernameTextField(tf);
        }
        gPane.setHgap(10);
        gPane.setLayoutX(325);
        gPane.setLayoutY(300);
        this.myPane.getChildren().addAll(gPane);
        System.out.println("UsernameController initialized");
    }

    @FXML
    private void backToPlayerMenu() throws IOException {
        TuringMachine.setRoot("player-menu");
    }

    @FXML
    private void backToMainMenu() throws IOException {
        TuringMachine.setRoot("main-menu");
    }

    @FXML
    private void validate() throws IOException {
        // get all the text fields
        // for each text field, get the text
        // if the text is empty, then show an error message
        // else, go to the next screen
        System.out.println("validate");
        
        Singleton singleton = Singleton.getInstance();
        for (TextField tf : singleton.getUsernameTextFieds()) {
            tf.setStyle("-fx-border-color: black ;");
            if (tf.getText().isEmpty()) {
                tf.setStyle("-fx-border-color: red ;");
                return;
            }
            singleton.addPlayer(new Player(tf.getText()));
        }
        TuringMachine.setRoot("difficulty-menu");
    }

}
