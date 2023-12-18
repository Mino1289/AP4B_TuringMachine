package com.turingmachine.core;

public class Game {
    private Problem problem;
    
    public Game(Problem _problem) {
        this.problem = _problem;
    }

    public void start() {
        System.out.println("Game started");
    }
}
