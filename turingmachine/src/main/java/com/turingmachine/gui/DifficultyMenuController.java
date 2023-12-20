package com.turingmachine.gui;

import java.io.IOException;
import javafx.fxml.FXML;

import com.turingmachine.core.DifficultyLevel;

public class DifficultyMenuController {

    @FXML
    private void selectEasyMode() throws IOException {
        Singleton.getInstance().setDifficultyLevel(DifficultyLevel.EASY);
        goToCriteriaCardSelection();
    }

    @FXML
    private void selectMediumMode() throws IOException {
        Singleton.getInstance().setDifficultyLevel(DifficultyLevel.MEDIUM);
        goToCriteriaCardSelection();
    }

    @FXML
    private void selectHardMode() throws IOException {
        Singleton.getInstance().setDifficultyLevel(DifficultyLevel.HARD);
        goToCriteriaCardSelection();
    }

    @FXML
    private void backToMainMenu() throws IOException {
        App.setRoot("main-menu");
    }

    private void goToCriteriaCardSelection() throws IOException {
        App.setRoot("criteria-card-selection");
    }
}
