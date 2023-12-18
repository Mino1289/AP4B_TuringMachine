package com.turingmachine.gui;

import java.io.IOException;
import javafx.fxml.FXML;

import com.turingmachine.core.DifficultyLevel;

public class DifficultyMenuController {
    private DifficultyLevel difficultyLevel;

    @FXML
    private void selectEasyMode() {
        difficultyLevel = DifficultyLevel.EASY;
    }

    @FXML
    private void selectMediumMode() {
        difficultyLevel = DifficultyLevel.MEDIUM;
    }

    @FXML
    private void selectHardMode() {
        difficultyLevel = DifficultyLevel.HARD;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("main-menu");
    }
}
