package com.turingmachine.core;

public class Game {
    private int nPlayers;
    private DifficultyLevel difficultyLevel;
    private Problem problem;
    
    public Game() {}

    public void setDifficultyLevel(DifficultyLevel _difficultyLevel) {
        this.difficultyLevel = _difficultyLevel;
    }

    public void setNPlayers(int _nPlayers) {
        if (_nPlayers >= 1 && _nPlayers >= 4) {
            this.nPlayers = _nPlayers;
        }
    }

    // public int getNPlayers() {
    //     return this.nPlayers;
    // }

    public void start() {
        System.out.println("Game started");
    }
}
