package com.turingmachine.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ResourceBundle;

import com.turingmachine.core.Game;
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
        Game game = Game.getInstance();

        ArrayList<Boolean> answerList = new ArrayList<Boolean>();
        ArrayList<Integer> idxList = new ArrayList<Integer>();
        GridPane myGridPane = new GridPane();
        myGridPane.setHgap(20);
        int i = 0, j = 0;
        for (Player player : game.getPlayersTerminated()) {
            boolean answer = game.getProblem().verify(player.getPunchCard());
            answerList.add(answer);
            if (answer) {
                idxList.add(i);
            }

            ImageView resultImageView = new ImageView();
            Label pLabel = new Label(player.getUsername()
                    + (answer ? ", tu as trouvé le bon code\n\t" + player.getTestCount() + " test de critères."
                            : ", tu n'as pas trouvé le bon code."));

            Image resultImage = new Image(
                    ResultScreenController.class.getResource((answer ? "true.png" : "false.png")).toString());
            resultImageView.setImage(resultImage);
            resultImageView.setPreserveRatio(true);
            myGridPane.addColumn(j, pLabel, resultImageView);

            i++;
            j++;
        }

        Label lbl = new Label();
        Button btn = new Button("Suivant");
        System.out.println("idxList.size = " + idxList.size());
        if (idxList.size() == 1) {
            // easy case, he wins the game
            Player winner = game.getPlayersTerminated().get(idxList.get(0));
            lbl.setText(winner.getUsername() + " a gagné la partie.");
            btn.setOnMouseClicked(e -> {
                game.erase();
                try {
                    TuringMachine.setRoot("main-menu");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
        } else if (idxList.size() > 1) {
            ArrayList<Player> winners = new ArrayList<Player>();
            for (int idx : idxList) {
                winners.add(game.getPlayersTerminated().get(idx));
            }
            winners.sort(Comparator.comparing(Player::getTestCount));
            Player winner = winners.get(0); // winner
            lbl.setText(winner.getUsername() + " a gagné la partie.");
            btn.setOnMouseClicked(e -> {
                game.erase();
                try {
                    TuringMachine.setRoot("main-menu");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
        } else if (idxList.size() == 0) {
            // ?? they tried, they lost: remove those who lost from the game
            lbl.setText("Personne n'a gagné, joueurs éliminé");
            game.getPlayersTerminated().forEach(player -> {
                game.getPlayers().remove(player);
            });
            // black magic 'cause we removed some players
            game.getPlayersTerminated().clear();
            game.setPlayerToChoose(0);
            int size = game.getPlayers().size();
            if (size == 0) {
                // ALED there is no one to play
                btn.setOnMouseClicked(e -> {
                    try {
                        // clear the game
                        game.erase();
                        TuringMachine.setRoot("main-menu");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
            } /*else if (size == 1){
                // solo = no one to play against = win
            } */else {
                for (Player player : game.getPlayers()) {
                    player.resetCurrentTestCount();
                }
                game.setNumberOfPlayers(size);
                game.setPlayerToPlay(0);
                game.nextPlayer();
                game.setPlayerToPlay(0);
                btn.setOnMouseClicked(e -> {
                    try {
                        TuringMachine.setRoot("punchcard-selection");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
            }
        }
        lbl.setLayoutX(320);
        lbl.setLayoutY(250);
        btn.setLayoutX(350);
        btn.setLayoutY(650);
        myGridPane.setLayoutX(0);
        myGridPane.setLayoutY(50);

        myPane.getChildren().addAll(myGridPane, lbl, btn);
    }
}
