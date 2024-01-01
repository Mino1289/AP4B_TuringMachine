package com.turingmachine.gui;

import java.io.IOException;
import javafx.fxml.FXML;

import com.turingmachine.core.DifficultyLevel;
import com.turingmachine.core.Game;

public class DifficultyMenuController {

    @FXML
    private void selectEasyMode() throws IOException {
        Game.getInstance().setDifficultyLevel(DifficultyLevel.EASY);
        goToPunchCardSelection();
    }

    @FXML
    private void selectMediumMode() throws IOException {
        Game.getInstance().setDifficultyLevel(DifficultyLevel.MEDIUM);
        goToPunchCardSelection();
    }

    @FXML
    private void selectHardMode() throws IOException {
        Game.getInstance().setDifficultyLevel(DifficultyLevel.HARD);
        goToPunchCardSelection();
    }

    @FXML
    private void backToMainMenu() throws IOException {
        TuringMachine.setRoot("main-menu");
    }

    private void goToPunchCardSelection() throws IOException {
        Game.getInstance().start();
        TuringMachine.setRoot("punchcard-selection");
    }
}
