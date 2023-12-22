package com.turingmachine.core;

public class CriteriaCard {
    private int id;
    private int testedCriteria;
    private Criteria[] criterias;

    public CriteriaCard(int id, int testedCriteria, Criteria[] criterias) {
        this.id = id;

        //TODO: throw error when error
        this.testedCriteria = testedCriteria;

        this.criterias = criterias;
    }

    public boolean verify(PunchCard punchCard) {
        return criterias[testedCriteria].verify(punchCard);
    }

    public int getId() {
        return this.id;
    }

    public int getIdx() {
        return this.testedCriteria;
    }
}