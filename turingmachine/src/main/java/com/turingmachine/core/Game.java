package com.turingmachine.core;

import java.util.ArrayList;

import com.turingmachine.parser.ProblemParser;

public class Game {
    private ArrayList<Player> players;
    private DifficultyLevel difficultyLevel;
    private Problem problem;
    
    public Game() {}

    public Game(ArrayList<Player> _players, DifficultyLevel _difficultyLevel) {
        this.players = _players;
        this.difficultyLevel = _difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel _difficultyLevel) {
        this.difficultyLevel = _difficultyLevel;
    }

    public void setPlayers(ArrayList<Player> _players) {
        if (_players.size() >= 1 && _players.size() >= 4) {
            this.players = _players;
        }
    }

    public Problem getProblem() {
        return this.problem;
    }

    public void start() {
        // randomly get a problem
        // for testing only, we will use the same problem 1.
        
        ProblemParser problemParser = new ProblemParser(Game.class.getResource("problems.txt").getFile().toString().replaceFirst("/", "").replaceAll("%20", " "));
        this.problem = problemParser.getProblems().get(0); // get the first problem
        // System.out.println(this.problem.getId());
    }
}
