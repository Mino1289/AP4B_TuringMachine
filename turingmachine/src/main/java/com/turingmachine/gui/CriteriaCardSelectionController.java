package com.turingmachine.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.turingmachine.core.CriteriaCard;
import com.turingmachine.core.Game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CriteriaCardSelectionController extends TMController implements Initializable {

    @FXML
    private Spinner<Integer> blue;
    @FXML
    private Spinner<Integer> yellow;
    @FXML
    private Spinner<Integer> purple;
    @FXML
    private AnchorPane mypane;
    
    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        super.start();
        int i = 0;
        for (CriteriaCard critCard : super.game.getProblem().getCriterias()) {
            ImageView selectedImage = new ImageView();
            Image image = new Image("file:turingmachine\\src\\main\\resources\\com\\turingmachine\\gui\\imgs\\"+critCard.getId()+".png");
            selectedImage.setImage(image);
            selectedImage.setPreserveRatio(true);
            selectedImage.setFitWidth(150);
            selectedImage.setFitHeight(150);
            selectedImage.setX(152 * i);
            selectedImage.setY(350);
            this.mypane.getChildren().addAll(selectedImage);
            i++;
        }
        
        System.out.println("INTITIALIZE");
    }

}
