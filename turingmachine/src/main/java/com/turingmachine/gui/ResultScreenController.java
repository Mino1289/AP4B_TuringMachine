package com.turingmachine.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ResourceBundle;

import com.turingmachine.core.Player;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class ResultScreenController implements Initializable {
    @FXML
    private AnchorPane myPane;

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        Singleton singleton = Singleton.getInstance();

        ArrayList<Boolean> answerList = new ArrayList<Boolean>();
        ArrayList<Integer> idxList = new ArrayList<Integer>();
        int i = 0;
        for (Player player : singleton.getPlayerFini()) {
            boolean answer = singleton.getGame().getProblem().verify(player.getPunchCard());
            answerList.add(answer);
            if (answer) {
                idxList.add(i);
            }
            i++;
        }
        GridPane myGridPane = new GridPane();
        i = 0;
        for (Player player : singleton.getPlayerFini()) {
            ImageView resultImageView = new ImageView();
            boolean answer = singleton.getGame().getProblem().verify(player.getPunchCard());
            Label pLabel = new Label(player.getUsername() + (answer ? ", tu as trouvé le bon code en: " + player.getTestCount() + " test de critères."  : ", tu n'as pas trouvé le bon code."));
            
            //TODO: Determine who won if multiple winner (the one with the less try)
            //TODO: Remove all the loosers
            
            // if (answer) {
            //     Label lbl = new Label("Fin de la partie");
            //     Button btn = new Button("Retour au menu");
            //     btn.setOnMouseClicked(e -> { 
            //         try {
            //             TuringMachine.setRoot("main-menu");
            //         } catch(IOException exep) {
            //             exep.printStackTrace();
            //         }
            //     });
            //     lbl.setLayoutX(400);
            //     lbl.setLayoutY(320);
            //     btn.setLayoutX(400);
            //     btn.setLayoutY(520);
            //     myPane.getChildren().addAll(lbl, btn);
            // }
            Image resultImage = new Image(ResultScreenController.class.getResource((answer ? "true.png" : "false.png")).toString());
            resultImageView.setImage(resultImage);
            resultImageView.setPreserveRatio(true);
            myGridPane.addColumn(i, pLabel, resultImageView);
            i++;
        }
        Label lbl = new Label();
        Button btn = new Button("Suivant");
        if (idxList.size() == 1) {
            // easy case, he wins the game
            Player winner = singleton.getPlayers().get(idxList.get(0)); 
            lbl.setText(winner.getUsername() + " a gagné la partie.");
            btn.setOnMouseClicked(e -> {
                singleton.erase();
                try {
                    TuringMachine.setRoot("main-menu");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } 
            });
        } else if (idxList.size() > 1) {
            ArrayList<Player> winners = new ArrayList<Player>();
            for (int idx : idxList) {
                winners.add(singleton.getPlayers().get(idx));
            }
            winners.sort(Comparator.comparing(Player::getTestCount));
            Player winner = winners.get(0); // winner
            lbl.setText(winner.getUsername() + " a gagné la partie.");
            btn.setOnMouseClicked(e -> {
                singleton.erase();
                try {
                    TuringMachine.setRoot("main-menu");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } 
            });
        } else if (idxList.size() == 0) {
            // ?? they tried, they lost: remove those who lost from the game
            lbl.setText("Personne n'a gagné, vous êtes tous éliminé");
            singleton.getPlayerFini().forEach(player -> {
                singleton.getPlayers().remove(player);
            });
            // black magic 'cause we removed some players
            singleton.getPlayerFini().clear();
            singleton.setNumberOfPlayers(singleton.getPlayers().size());
            singleton.nextPlayer();
            singleton.setPlayerToPlay(0);
            btn.setOnMouseClicked(e -> {
                try {
                    TuringMachine.setRoot("punchcard-selection");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } 
            });
        }
        lbl.setLayoutX(400);
        lbl.setLayoutY(320);
        btn.setLayoutX(400);
        btn.setLayoutY(520);
        
        myPane.getChildren().addAll(myGridPane, lbl, btn);
    }
}
