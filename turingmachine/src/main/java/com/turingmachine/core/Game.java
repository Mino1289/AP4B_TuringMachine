package com.turingmachine.core;

import java.util.ArrayList;

import com.turingmachine.parser.ProblemParser;

import javafx.scene.control.TextField;

public class Game {
    private static final String PROBLEMS_PATH = "turingmachine/src/main/resources/com/turingmachine/core/problems/";
    private static final String EASY_PROBLEMS_PATH = PROBLEMS_PATH + "easy.txt";
    private static final String MEDIUM_PROBLEMS_PATH = PROBLEMS_PATH + "medium.txt";
    private static final String HARD_PROBLEMS_PATH = PROBLEMS_PATH + "hard.txt";

    private static Game instance = new Game();

    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<TextField> usernameTextFieds = new ArrayList<TextField>();

    private int numberOfPlayers;
    private DifficultyLevel difficultyLevel;
    private Problem problem;
    private int playerToPlay = 0;
    private ArrayList<Player> playerfini = new ArrayList<Player>();

    public static Game getInstance() {
        return instance;
    }
    
    //TODO: delete
    public Game() {
    }

    public Game(ArrayList<Player> _players, DifficultyLevel _difficultyLevel) {
        this.players = _players;
        this.difficultyLevel = _difficultyLevel;
        this.numberOfPlayers = this.players.size();

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

    public void setNumberOfPlayers(int _numberOfPlayers) {
        this.numberOfPlayers = _numberOfPlayers;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
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

    public void setPlayerToPlay(int pl) {
        this.playerToPlay = pl;
    }

    public int getPlayerToPlay() {
        return this.playerToPlay;
    }

    public void nextPlayer() {
        this.players.get(this.playerToPlay).resetCurrentTestCount();
        this.playerToPlay = (this.playerToPlay + 1) % this.numberOfPlayers;
    }

    public boolean sameManche() {
        return (this.playerToPlay + 1 - this.numberOfPlayers) != 0;
    }

    public void setPlayerFini(Player player) {
        this.playerfini.add(player);
    }

    public ArrayList<Player> getPlayerFini() {
        return this.playerfini;
    }

    public void start() {
        instance = new Game(this.players, this.difficultyLevel);
        /* ProblemParser problemParser = new ProblemParser(
                "turingmachine/src/main/resources/com/turingmachine/core/problems.txt");
        this.problem = problemParser.getProblems().get(0); // get the first problem */
        //System.out.println(this.problem.getId());
    }

    public void erase() {
        this.players.clear();
        this.usernameTextFieds.clear();
        this.playerfini.clear();
        this.playerToPlay = 0;
    }
}
