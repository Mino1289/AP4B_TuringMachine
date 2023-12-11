package com.turingmachine.core;

public class CriteriaCardGenerator {

    public static CriteriaCard generateCriteriaCard(int id, int testedCriteria) {
        Criteria[] criterias;
        switch (id) {
            case 1:
                criterias = new Criteria[] {

                };
                break;
            case 2:
                criterias = new Criteria[] {

                };
                break;
            case 3:
                criterias = new Criteria[] {

                };
                break;
            case 4:
                criterias = new Criteria[] {

                };
                break;
            case 5:
                criterias = new Criteria[] {

                };
                break;
            case 6:
                criterias = new Criteria[] {

                };
                break;
            case 7:
                criterias = new Criteria[] {

                };
                break;
            case 8:
                criterias = new Criteria[] {

                };
                break;
            case 9:
                criterias = new Criteria[] {

                };
                break;
            case 10:
                criterias = new Criteria[] {

                };
                break;
            case 11:
                criterias = new Criteria[] {

                };
                break;
            case 12:
                criterias = new Criteria[] {

                };
                break;
            case 13:
                criterias = new Criteria[] {

                };
                break;
            case 14:
                criterias = new Criteria[] {

                };
                break;
            case 15:
                criterias = new Criteria[] {

                };
                break;
            case 16:
                criterias = new Criteria[] {

                };
                break;
            case 17:
                criterias = new Criteria[] {

                };
                break;
            case 18:
                criterias = new Criteria[] {

                };
                break;
            case 19:
                criterias = new Criteria[] {

                };
                break;
            case 20:
                criterias = new Criteria[] {

                };
                break;
            case 21:
                criterias = new Criteria[] {

                };
                break;
            case 22:
                criterias = new Criteria[] {

                };
                break;
            case 23:
                criterias = new Criteria[] {

                };
                break;
            case 24:
                criterias = new Criteria[] {

                };
                break;
            case 25:
                criterias = new Criteria[] {

                };
                break;
            case 26:
                criterias = new Criteria[] {

                };
                break;
            case 27:
                criterias = new Criteria[] {

                };
                break;
            case 28:
                criterias = new Criteria[] {

                };
                break;
            case 29:
                criterias = new Criteria[] {

                };
                break;
            case 30:
                criterias = new Criteria[] {

                };
                break;
            case 31:
                criterias = new Criteria[] {

                };
                break;
            case 32:
                criterias = new Criteria[] {

                };
                break;
            case 33:
                criterias = new Criteria[] {

                };
                break;
            case 34:
                criterias = new Criteria[] {

                };
                break;
            case 35:
                criterias = new Criteria[] {

                };
                break;
            case 36:
                criterias = new Criteria[] {

                };
                break;
            case 37:
                criterias = new Criteria[] {

                };
                break;
            case 38:
                criterias = new Criteria[] {

                };
                break;
            case 39:
                criterias = new Criteria[] {

                };
                break;
            case 40:
                criterias = new Criteria[] {

                };
                break;
            case 41:
                criterias = new Criteria[] {

                };
                break;
            case 42:
                criterias = new Criteria[] {

                };
                break;
            case 43:
                criterias = new Criteria[] {

                };
                break;
            case 44:
                criterias = new Criteria[] {

                };
                break;
            case 45:
                criterias = new Criteria[] {

                };
                break;
            case 46:
                criterias = new Criteria[] {

                };
                break;
            case 47:
                criterias = new Criteria[] {

                };
                break;
            case 48:
                criterias = new Criteria[] {

                };
                break;
            default:
                throw new IllegalArgumentException("Invalid criteria card id");
        }
        return new CriteriaCard(id, testedCriteria, criterias);
    }
}
