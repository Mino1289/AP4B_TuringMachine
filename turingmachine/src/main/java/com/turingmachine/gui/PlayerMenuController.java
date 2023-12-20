package com.turingmachine.gui;

import java.io.IOException;


import javafx.fxml.FXML;

public class PlayerMenuController {

    @FXML
    private void selectSolo() throws IOException {
        Singleton.getInstance().setNumberOfPlayers(1);
        goToUsernameSelection();
    }

    @FXML
    private void select2Player() throws IOException {
        Singleton.getInstance().setNumberOfPlayers(2);
        goToUsernameSelection();
    }

    @FXML
    private void select3Player() throws IOException {
        Singleton.getInstance().setNumberOfPlayers(3);
        goToUsernameSelection();
    }

    @FXML
    private void select4Player() throws IOException {
        Singleton.getInstance().setNumberOfPlayers(4);
        goToUsernameSelection();
    }

    private void goToUsernameSelection() throws IOException {
        App.setRoot("username-selection");
    }
    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("main-menu");
    }
}
