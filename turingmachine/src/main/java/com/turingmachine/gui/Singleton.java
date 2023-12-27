package com.turingmachine.gui;

import java.util.ArrayList;

import com.turingmachine.core.DifficultyLevel;
import com.turingmachine.core.Player;
import com.turingmachine.core.PunchCard;
import com.turingmachine.core.Game;

import javafx.scene.control.TextField;

public class Singleton {
        private static Singleton instance = new Singleton();
        private int numberOfPlayers;        
        private ArrayList<TextField> usernameTextFieds = new ArrayList<TextField>();
        private ArrayList<Player> players = new ArrayList<Player>();        
        private DifficultyLevel difficultyLevel;
        private Game game;
        private int playerToPlay = 0;
        private int testCounterCurrentPlayerLeft = 3;
        private PunchCard currentPunchCard;
        
        public static Singleton getInstance(){
            return instance;
        }

        public void setNumberOfPlayers(int numberOfPlayers) {
            this.numberOfPlayers = numberOfPlayers;
        }

        public int getNumberOfPlayers() {
            return numberOfPlayers;
        }

        public void addUsernameTextField(TextField tf) {
            this.usernameTextFieds.add(tf);
        }

        public ArrayList<TextField> getUsernameTextFieds() {
            return usernameTextFieds;
        }

        public void addPlayer(Player player) {
            this.players.add(player);
        }

        public ArrayList<Player> getPlayers() {
            return players;
        }

        public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
            this.difficultyLevel = difficultyLevel;
        }

        public DifficultyLevel getDifficultyLevel() {
            return difficultyLevel;
        }

        public void start() {
            this.game = new Game(this.players, this.difficultyLevel);
            this.game.start();
        }

        public Game getGame() {
            return game;
        }

        public int getPlayerToPlay() {
            return this.playerToPlay;
        }

        public void nextPlayer() {
            this.testCounterCurrentPlayerLeft = 3;
            this.playerToPlay = (this.playerToPlay + 1) % this.numberOfPlayers;
        }

        public boolean canCheckAnotherCriteria() {
            return testCounterCurrentPlayerLeft != 0;
        }

        public void decrementTestCounter() {
            this.testCounterCurrentPlayerLeft--;
        }

        public void setCurrentPunchCard(int blue, int yellow, int purple) {
            this.currentPunchCard = new PunchCard(blue, yellow, purple);
        }

        public PunchCard getCurrentPunchCard() {
            return this.currentPunchCard;
        }
        
    }
