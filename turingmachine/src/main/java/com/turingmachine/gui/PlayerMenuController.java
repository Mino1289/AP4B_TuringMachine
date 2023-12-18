package com.turingmachine.gui;

import java.io.IOException;


import javafx.fxml.FXML;

public class PlayerMenuController extends TMController {
    private int nPlayers;

    @FXML
    private void selectSolo() throws IOException {
        this.nPlayers = 1;
        goToDifficultyMenu();
    }

    @FXML
    private void select2Player() throws IOException {
        this.nPlayers = 2;
        goToDifficultyMenu();
    }

    @FXML
    private void select3Player() throws IOException {
        this.nPlayers = 3;
        goToDifficultyMenu();
    }

    @FXML
    private void select4Player() throws IOException {
        this.nPlayers = 4;
        goToDifficultyMenu();
    }

    private void goToDifficultyMenu() throws IOException {
        super.setNPlayers(this.nPlayers);
        App.setRoot("difficulty-menu");
    }
    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("main-menu");
    }
}
