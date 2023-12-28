package com.turingmachine.core;

public class CriteriaCard {
    private int id;
    private int testedCriteria;
    private Criteria[] criterias;

    public CriteriaCard(int id, int testedCriteria, Criteria[] criterias) {
        this.id = id;

        //TODO: implement custom exception
        if (testedCriteria < 0 || testedCriteria >= criterias.length) {
            throw new IllegalArgumentException("testedCriteria must be between 0 and " + criterias.length);
        }
        this.testedCriteria = testedCriteria;
        this.criterias = criterias;
    }

    public boolean verify(PunchCard punchCard) {
        return criterias[testedCriteria].verify(punchCard);
    }

    public int getId() {
        return this.id;
    }

    public int getTestedCriteria() {
        return this.testedCriteria;
    }
}