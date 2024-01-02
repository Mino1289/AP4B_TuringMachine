package com.turingmachine.core;

public class Player {
    private int testCount;
    private int currentTestCount = 3;
    private String username;
    private PunchCard punchCard;

    public Player(String _username) {
        this.testCount = 0;
        this.username = _username;
    }

    public void incrementTestCount() {
        this.testCount++;
    }

    public int getTestCount() {
        return this.testCount;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPunchCard(PunchCard pCard) {
        this.punchCard = pCard;
    }

    public PunchCard getPunchCard() {
        return this.punchCard;
    }

    public void resetCurrentTestCount() {
        this.currentTestCount = 3;
    }

    public boolean canCheckAnotherCriteria() {
        return this.currentTestCount != 0;
    }

    public void decrementCurrentTestCounter() {
        this.currentTestCount--;
    }
}