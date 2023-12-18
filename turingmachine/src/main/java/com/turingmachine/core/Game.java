package com.turingmachine.core;

import com.turingmachine.parser.ProblemParser;

public class Game {
    private int nPlayers;
    private DifficultyLevel difficultyLevel;
    private Problem problem;
    
    public Game() {}

    public Game(int _nPlayers, DifficultyLevel _difficultyLevel) {
        this.nPlayers = _nPlayers;
        this.difficultyLevel = _difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel _difficultyLevel) {
        this.difficultyLevel = _difficultyLevel;
    }

    public void setNPlayers(int _nPlayers) {
        if (_nPlayers >= 1 && _nPlayers >= 4) {
            this.nPlayers = _nPlayers;
        }
    }

    public Problem getProblem() {
        return this.problem;
    }

    public void start() {
        // randomly get a problem
        // for testing only, we will use the same problem 1.
        
        ProblemParser problemParser = new ProblemParser("turingmachine\\src\\main\\resources\\com\\turingmachine\\core\\problems.txt");
        this.problem = problemParser.getProblems().get(0); // get the first problem
        // System.out.println(this.problem.getId());        
    }
}
