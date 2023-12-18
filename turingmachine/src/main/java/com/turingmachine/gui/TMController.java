package com.turingmachine.gui;

import com.turingmachine.core.DifficultyLevel;
import com.turingmachine.core.Game;

public class TMController {
    protected int nPlayers;
    protected DifficultyLevel difficultyLevel;
    protected Game game;
    
    public void setNPlayers(int _nPlayers) {
        if (_nPlayers >= 1 && _nPlayers >= 4) {
            this.nPlayers = _nPlayers;
        }
    }

    public void setDifficultyLevel(DifficultyLevel _difficultyLevel) {
        this.difficultyLevel = _difficultyLevel;
    }

    public int getNPlayers() {
        return this.nPlayers;
    }

    public DifficultyLevel getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public void start() {
        this.game = new Game(this.nPlayers, this.difficultyLevel);
        this.game.start();
    }
}
