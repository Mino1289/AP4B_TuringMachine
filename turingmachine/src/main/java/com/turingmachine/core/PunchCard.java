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

    protected int nCount(int n) {
        return (blue == n ? 1 : 0) + (yellow == n ? 1 : 0)
                + (purple == n ? 1 : 0);
    }

    protected int evenCount() {
        return (blue % 2 == 0 ? 1 : 0) + (yellow % 2 == 0 ? 1 : 0)
                + (purple % 2 == 0 ? 1 : 0);
    }

    protected boolean uniquePair() {
        return (blue == yellow && blue != purple) ||
                (blue == purple && blue != yellow) ||
                (yellow == purple && yellow != blue);
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
