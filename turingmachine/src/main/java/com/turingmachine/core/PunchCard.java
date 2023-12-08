package com.turingmachine.core;

public class PunchCard {
    protected Integer blue;
    protected Integer yellow;
    protected Integer purple;
    
    public PunchCard(Integer _blue, Integer _yellow, Integer _purple) {
        this.blue = _blue;
        this.yellow = _yellow;
        this.purple = _purple;
    }

    public Integer getBlue() {
        return this.blue;
    }

    public Integer getYellow() {
        return this.yellow;
    }

    public Integer getPurple() {
        return this.purple;
    }
}
