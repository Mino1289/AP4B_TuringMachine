package com.turingmachine.gui;

import java.io.IOException;
import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    private void startGame() throws IOException {
        App.setRoot("player-menu");
    }

    @FXML
    private void showHighScores() {
        
    }


    @FXML
    public void quit() {
        System.exit(0);
    }
}