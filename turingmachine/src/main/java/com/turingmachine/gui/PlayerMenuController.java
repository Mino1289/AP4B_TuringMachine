package com.turingmachine.gui;

import java.io.IOException;

import com.turingmachine.core.Game;

import javafx.fxml.FXML;

public class PlayerMenuController {

    @FXML
    private void selectSolo() throws IOException {
        Game.getInstance().setNumberOfPlayers(1);
        goToUsernameSelection();
    }

    @FXML
    private void select2Player() throws IOException {
        Game.getInstance().setNumberOfPlayers(2);
        goToUsernameSelection();
    }

    @FXML
    private void select3Player() throws IOException {
        Game.getInstance().setNumberOfPlayers(3);
        goToUsernameSelection();
    }

    @FXML
    private void select4Player() throws IOException {
        Game.getInstance().setNumberOfPlayers(4);
        goToUsernameSelection();
    }

    private void goToUsernameSelection() throws IOException {
        TuringMachine.setRoot("username-selection");
    }
    @FXML
    private void backToMainMenu() throws IOException {
        TuringMachine.setRoot("main-menu");
    }
}
