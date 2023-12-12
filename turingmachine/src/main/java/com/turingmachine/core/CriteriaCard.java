package com.turingmachine.core;

public class CriteriaCard {
    private int id;
    private int testedCriteria;
    private Criteria[] criterias;

    public CriteriaCard(int id, int testedCriteria, Criteria... criterias) {
        this.id = id;

        int criteriaCount = criterias.length;
        //TODO: throw error instead
        testedCriteria = testedCriteria < 1 ? 0 : testedCriteria - 1;
        testedCriteria = testedCriteria >= criteriaCount ? criteriaCount - 1 : testedCriteria;
        this.testedCriteria = testedCriteria;

        this.criterias = criterias;
    }

    public boolean verify(PunchCard punchCard) {
        return criterias[testedCriteria].verify(punchCard);
    }
}
