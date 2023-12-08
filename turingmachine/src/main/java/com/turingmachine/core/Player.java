package com.turingmachine.core;

public class Player {
    private Integer testCount;
    private String username;

    public Player(String _username) {
        this.testCount = 0;
        this.username = _username;
    }

    public void incrementTestCount() {
        this.testCount++;
    }
}
