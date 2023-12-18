package com.turingmachine.gui;

import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    private void startGame() {
        System.out.println("Start game!");
    }

    @FXML
    private void showHighScores() {
        System.out.println("Show high scores!");
    }


   @FXML
   public void quit() {
      System.out.println("Quit!");
   }
}