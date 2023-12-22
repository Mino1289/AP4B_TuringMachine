package com.turingmachine.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.turingmachine.core.CriteriaCard;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


public class CriteriaCardSelectionController implements Initializable {

    @FXML
    private AnchorPane mypane;
    // TODO: Add a GridPane to the FXML file and use it to display the cards
    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        Singleton singleton = Singleton.getInstance();
        singleton.start();
        GridPane mygpane = new GridPane();
        int i = 0;
        ArrayList<CriteriaCard> critCards = singleton.getGame().getProblem().getCriterias();
        System.out.println(critCards.size());
        for (CriteriaCard critCard : critCards) {
            // System.out.println(critCard.getId());
            ImageView selectedImage = new ImageView();
            Image image = new Image("file:turingmachine\\src\\main\\resources\\com\\turingmachine\\gui\\imgs\\"+critCard.getId()+".png");
            selectedImage.setImage(image);
            selectedImage.setPreserveRatio(true);
            selectedImage.setFitWidth(200);
            selectedImage.setFitHeight(200);
            mygpane.add(selectedImage, critCards.size() > 4 ? (i >= 3 ? i-3 : i) : i,  critCards.size() > 4 && i >= 3 ? 1 : 0);
            i++;
        }
        mygpane.setLayoutX(25);
        mygpane.setLayoutY(0);

        this.mypane.getChildren().addAll(mygpane);
        System.out.println("CriteriaCardSelectionController initialized");
    }

}
