package com.turingmachine.core;

public class PunchCard {
    private Integer blue;
    private Integer yellow;
    private Integer purple;
    
    public PunchCard(Integer _blue, Integer _yellow, Integer _purple) {
        this.blue = _blue;
        this.yellow = _yellow;
        this.purple = _purple;
    }

    public PunchCard(Integer x) {
        // max x = 555; min x = 111
        this.blue = x % 10;
        x /= 10;
        this.yellow = x % 10;
        x /= 10;
        this.purple = x % 10;
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
