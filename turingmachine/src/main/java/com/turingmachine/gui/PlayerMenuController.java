package com.turingmachine.gui;

import javafx.fxml.FXML;

public class PlayerMenuController {
    @FXML
    public void selectSolo() {
        System.out.println("Solo!");
    }

    @FXML
    public void select2Player() {
        System.out.println("2 Player!");
    }

    @FXML
    public void select3Player() {
        System.out.println("3 Player!");
    }

    @FXML
    public void select4Player() {
        System.out.println("4 Player!");
    }

    @FXML
    public void backToMainMenu() {
        System.out.println("Back to Main Menu!");
    }
        
}
