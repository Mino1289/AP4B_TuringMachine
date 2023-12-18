package com.turingmachine.core;

import java.util.ArrayList;

public class Problem {
    private int id;
    private ArrayList<CriteriaCard> criterias;
    private PunchCard answer;

    public Problem(int _id, ArrayList<CriteriaCard> _criterias, PunchCard _answer) {
        this.id = _id;
        this.criterias = _criterias;
        this.answer = _answer;
    }

    /**
     * Verify that the punch card guess from the player is correct
     * @param punchCard
     * @return true if the punch card is correct, false otherwise
     */
    public boolean verify(PunchCard punchCard) {
        return this.answer == punchCard;
    }
}