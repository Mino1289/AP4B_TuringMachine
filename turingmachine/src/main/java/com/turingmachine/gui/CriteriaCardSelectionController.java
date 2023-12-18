package com.turingmachine.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Spinner;

public class CriteriaCardSelectionController {

    @FXML
    private Spinner blue;

    @FXML
    private Spinner yellow;

    @FXML
    private Spinner purple;
    
    @FXML
    private void selectCriteriaCard1() {
        System.out.println(blue.getValue());
        System.out.println("Criteria Card 1!");
    }

    @FXML
    private void selectCriteriaCard2() {
        System.out.println("Criteria Card 2!");
    }

    @FXML
    private void selectCriteriaCard3() {
        System.out.println("Criteria Card 3!");
    }

    @FXML
    private void selectCriteriaCard4() {
        System.out.println("Criteria Card 4!");
    }

    @FXML
    private void selectCriteriaCard5() {
        System.out.println("Criteria Card 5!");
    }

    @FXML
    private void selectCriteriaCard6() {
        System.out.println("Criteria Card 6!");
    }

    
        
}
