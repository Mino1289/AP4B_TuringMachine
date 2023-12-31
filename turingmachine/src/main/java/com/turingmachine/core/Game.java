package com.turingmachine.core;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.turingmachine.parser.ProblemParser;

public class Game {
    private static final String PROBLEMS_PATH = "turingmachine/src/main/resources/com/turingmachine/core/problems/";
    private static final String EASY_PROBLEMS_PATH = PROBLEMS_PATH + "easy.txt";
    private static final String MEDIUM_PROBLEMS_PATH = PROBLEMS_PATH + "medium.txt";
    private static final String HARD_PROBLEMS_PATH = PROBLEMS_PATH + "hard.txt";

    private ArrayList<Player> players;
    private DifficultyLevel difficultyLevel;
    private Problem problem;

    //TODO: delete
    public Game() {
    }

    public Game(ArrayList<Player> _players, DifficultyLevel _difficultyLevel) {
        this.players = _players;
        this.difficultyLevel = _difficultyLevel;

        ProblemParser problemParser;
        switch (_difficultyLevel) {
            case EASY:
                problemParser = new ProblemParser(EASY_PROBLEMS_PATH);
                break;
            case MEDIUM:
                problemParser = new ProblemParser(MEDIUM_PROBLEMS_PATH);
                break;
            case HARD:
                problemParser = new ProblemParser(HARD_PROBLEMS_PATH);
                break;
            default:
            //TODO: create custom exception
                throw new IllegalArgumentException("Unexpected value: " + _difficultyLevel);
        }
        ArrayList<Problem> problems = problemParser.getProblems();
        int problemCount = problems.size();
        this.problem = problems.get((int) (Math.random() * problemCount));
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
        /* ProblemParser problemParser = new ProblemParser(
                "turingmachine/src/main/resources/com/turingmachine/core/problems.txt");
        this.problem = problemParser.getProblems().get(0); // get the first problem */
        //System.out.println(this.problem.getId());
    }
}
