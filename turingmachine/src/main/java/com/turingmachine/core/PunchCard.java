package com.turingmachine.core;

public class PunchCard {
    private int blue;
    private int yellow;
    private int purple;
    
    public PunchCard(int _blue, int _yellow, int _purple) {
        this.blue = _blue;
        this.yellow = _yellow;
        this.purple = _purple;
    }

    public PunchCard(int x) {
        // max x = 555; min x = 111
        this.blue = x % 10;
        x /= 10;
        this.yellow = x % 10;
        x /= 10;
        this.purple = x % 10;
    }

    public int getBlue() {
        return this.blue;
    }

    public int getYellow() {
        return this.yellow;
    }

    public int getPurple() {
        return this.purple;
    }
}
