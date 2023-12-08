package com.turingmachine.core;

import java.util.ArrayList;

public class Problem {
    private Integer id;
    private ArrayList<Integer> criteriaIds;
    private PunchCard answer;

    public Problem(Integer _id) {
        this.id = _id;
    }

    /**
     * Verify that the punch card guess from the player is correct
     * @param punchCard
     * @return true if the punch card is correct, false otherwise
     */
    public Boolean verify(PunchCard punchCard) {
        return this.answer == punchCard;
    }
}
