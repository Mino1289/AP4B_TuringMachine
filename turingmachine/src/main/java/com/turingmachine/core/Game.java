package com.turingmachine.core;

import java.util.ArrayList;

import com.turingmachine.parser.ProblemParser;

import javafx.scene.control.TextField;

public class Game {
    private static final String PROBLEMS_PATH = "turingmachine/src/main/resources/com/turingmachine/core/problems/";
    private static final String EASY_PROBLEMS_PATH = PROBLEMS_PATH + "easy.txt";
    private static final String MEDIUM_PROBLEMS_PATH = PROBLEMS_PATH + "medium.txt";
    private static final String HARD_PROBLEMS_PATH = PROBLEMS_PATH + "hard.txt";

    private ArrayList<Player> players = new ArrayList<Player>();
    private Problem problem;
    
    private ArrayList<TextField> usernameTextFieds = new ArrayList<TextField>();
    private int numberOfPlayers;
    private DifficultyLevel difficultyLevel;
    
    
    private int playerToPlay = 0;
    private ArrayList<Player> playerTerminated = new ArrayList<Player>();
    
    private static Game instance = new Game();
    
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

    // used for the UI component, so we can retrieve information between scenes. Before the Game is "really" initialized.
    public void setDifficultyLevel(DifficultyLevel _difficultyLevel) {
        this.difficultyLevel = _difficultyLevel;
    }

    public Problem getProblem() {
        return this.problem;
    }

    // used for the UI component, so we can retrieve information between scenes. Before the Game is "really" initialized.
    public void setNumberOfPlayers(int _numberOfPlayers) {
        this.numberOfPlayers = _numberOfPlayers;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    // used for the UI component, so we can retrieve information between scenes. Before the Game is "really" initialized.
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    // used for the UI component, so we can retrieve information between scenes. Before the Game is "really" initialized.
    public void addUsernameTextField(TextField tf) {
        this.usernameTextFieds.add(tf);
    }

    // used for the UI component, so we can retrieve information between scenes. Before the Game is "really" initialized.
    public ArrayList<TextField> getUsernameTextFieds() {
        return usernameTextFieds;
    }

    // used for the UI component, so we can retrieve information between scenes. Before the Game is "really" initialized.
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    // used to determine which player's turn is.
    public void setPlayerToPlay(int pl) {
        this.playerToPlay = pl;
    }

    // used to determine which player's turn is.
    public int getPlayerToPlay() {
        return this.playerToPlay;
    }

    // used to determine which player's turn is.
    public void nextPlayer() {
        this.players.get(this.playerToPlay).resetCurrentTestCount();
        this.playerToPlay = (this.playerToPlay + 1) % this.numberOfPlayers;
    }

    // used to determine which player's turn is.
    public boolean sameRound() {
        return (this.playerToPlay + 1 - this.numberOfPlayers) != 0;
    }

    // used to know who is terminated
    public void setPlayerTerminated(Player player) {
        this.playerTerminated.add(player);
    }

    // used to know who is terminated
    public ArrayList<Player> getPlayerTerminated() {
        return this.playerTerminated;
    }

    public void start() {
        instance = new Game(this.players, this.difficultyLevel);
        /* ProblemParser problemParser = new ProblemParser(
                "turingmachine/src/main/resources/com/turingmachine/core/problems.txt");
        this.problem = problemParser.getProblems().get(0); // get the first problem */
        //System.out.println(this.problem.getId());
    }

    // after a game, we want to erase everything, to restart or not another game.
    public void erase() {
        this.players.clear();
        this.usernameTextFieds.clear();
        this.playerTerminated.clear();
        this.playerToPlay = 0;
    }
}
