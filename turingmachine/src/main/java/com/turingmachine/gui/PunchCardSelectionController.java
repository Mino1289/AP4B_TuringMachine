package com.turingmachine.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Spinner;

public class PunchCardSelectionController {
    
    @FXML
    private Spinner<Integer> blue;
    @FXML
    private Spinner<Integer> yellow;
    @FXML
    private Spinner<Integer> purple;

    @FXML
    private void validate() {
        System.out.println("blue: " + blue.getValue());
        System.out.println("yellow: " + yellow.getValue());
        System.out.println("purple: " + purple.getValue());
    }

}
