package com.turingmachine.core;

public class PunchCard {
    protected int blue;
    protected int yellow;
    protected int purple;

    public PunchCard(int _blue, int _yellow, int _purple) {
        // TODO: check if each value between 1 & 5 include
        this.blue = _blue;
        this.yellow = _yellow;
        this.purple = _purple;
    }

    public PunchCard(int x) {
        // max x = 555; min x = 111
        this.purple = x % 10;
        x /= 10;
        this.yellow = x % 10;
        x /= 10;
        this.blue = x % 10;
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

    public int getBlue() {
        return this.blue;
    }

    public int getYellow() {
        return this.yellow;
    }

    public int getPurple() {
        return this.purple;
    }

    public String toString() {
        return this.blue + "|" + this.yellow + "|" + this.purple;
    }
}