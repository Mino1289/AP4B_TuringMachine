package com.turingmachine.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class CriteriaCardSelectionController extends TMController {

    @FXML
    private Spinner<Integer> blue;

    @FXML
    private Spinner<Integer> yellow;

    @FXML
    private Spinner<Integer> purple;
    
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

    private void initialize() {
        SpinnerValueFactory<Integer> spinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5,1);
        blue.setValueFactory(spinner);
        yellow.setValueFactory(spinner);
        purple.setValueFactory(spinner);
    }

}
