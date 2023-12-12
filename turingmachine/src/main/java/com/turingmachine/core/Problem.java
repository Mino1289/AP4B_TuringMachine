package com.turingmachine.core;

import java.util.ArrayList;

public class Problem {
    private int id;
    private ArrayList<Integer> criteriaIds;
    private PunchCard answer;

    public Problem(int _id, ArrayList<Integer> _criteriaIds, PunchCard _answer) {
        this.id = _id;
        this.criteriaIds = _criteriaIds;
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
