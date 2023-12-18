package com.turingmachine.gui;

import java.io.IOException;
import javafx.fxml.FXML;

import com.turingmachine.core.DifficultyLevel;

public class DifficultyMenuController extends TMController {

    @FXML
    private void selectEasyMode() {
        super.game.setDifficultyLevel(DifficultyLevel.EASY);
    }

    @FXML
    private void selectMediumMode() {
        super.game.setDifficultyLevel(DifficultyLevel.MEDIUM);
    }

    @FXML
    private void selectHardMode() {
        super.game.setDifficultyLevel(DifficultyLevel.HARD);
    }

    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("main-menu");
    }
}
