package com.turingmachine.core;

public class CriteriaCardGenerator {

    public static CriteriaCard generateCriteriaCard(int id, int testedCriteria) {
        Criteria[] criterias;
        switch (id) {
            case 1:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue == 1,
                        punchCard -> punchCard.blue > 1,
                };
                break;
            case 2:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < 3,
                        punchCard -> punchCard.blue == 3,
                        punchCard -> punchCard.blue > 3,
                };
                break;
            case 3:
                criterias = new Criteria[] {
                        punchCard -> punchCard.yellow < 3,
                        punchCard -> punchCard.yellow == 3,
                        punchCard -> punchCard.yellow > 3,
                };
                break;
            case 4:
                criterias = new Criteria[] {
                        punchCard -> punchCard.yellow < 4,
                        punchCard -> punchCard.yellow == 4,
                        punchCard -> punchCard.yellow > 4,
                };
                break;
            case 5:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue % 2 == 0,
                        punchCard -> punchCard.blue % 2 == 1,
                };
                break;
            case 6:
                criterias = new Criteria[] {
                        punchCard -> punchCard.yellow % 2 == 0,
                        punchCard -> punchCard.yellow % 2 == 1,
                };
                break;
            case 7:
                criterias = new Criteria[] {
                        punchCard -> punchCard.purple % 2 == 0,
                        punchCard -> punchCard.purple % 2 == 1,
                };
                break;
            case 8:
                criterias = new Criteria[] {
                        punchCard -> punchCard.nCount(1) == 0,
                        punchCard -> punchCard.nCount(1) == 1,
                        punchCard -> punchCard.nCount(1) == 2,
                        punchCard -> punchCard.nCount(1) == 3,
                };
                break;
            case 9:
                criterias = new Criteria[] {
                        punchCard -> punchCard.nCount(3) == 0,
                        punchCard -> punchCard.nCount(3) == 1,
                        punchCard -> punchCard.nCount(3) == 2,
                        punchCard -> punchCard.nCount(3) == 3,
                };
                break;
            case 10:
                criterias = new Criteria[] {
                        punchCard -> punchCard.nCount(4) == 0,
                        punchCard -> punchCard.nCount(4) == 1,
                        punchCard -> punchCard.nCount(4) == 2,
                        punchCard -> punchCard.nCount(4) == 3,
                };
                break;
            case 11:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < punchCard.yellow,
                        punchCard -> punchCard.blue == punchCard.yellow,
                        punchCard -> punchCard.blue > punchCard.yellow,
                };
                break;
            case 12:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < punchCard.purple,
                        punchCard -> punchCard.blue == punchCard.purple,
                        punchCard -> punchCard.blue > punchCard.purple,
                };
                break;
            case 13:
                criterias = new Criteria[] {
                        punchCard -> punchCard.yellow < punchCard.purple,
                        punchCard -> punchCard.yellow == punchCard.purple,
                        punchCard -> punchCard.yellow > punchCard.purple,
                };
                break;
            case 14:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < punchCard.yellow && punchCard.blue < punchCard.purple,
                        punchCard -> punchCard.yellow < punchCard.blue && punchCard.yellow < punchCard.purple,
                        punchCard -> punchCard.purple < punchCard.blue && punchCard.purple < punchCard.yellow,
                };
                break;
            case 15:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue > punchCard.yellow && punchCard.blue > punchCard.purple,
                        punchCard -> punchCard.yellow > punchCard.blue && punchCard.yellow > punchCard.purple,
                        punchCard -> punchCard.purple > punchCard.blue && punchCard.purple > punchCard.yellow,
                };
                break;
            case 16:
                criterias = new Criteria[] {
                        punchCard -> punchCard.evenCount() > 1,
                        punchCard -> punchCard.evenCount() < 2,
                };
                break;
            case 17:
                criterias = new Criteria[] {
                        punchCard -> punchCard.evenCount() == 0,
                        punchCard -> punchCard.evenCount() == 1,
                        punchCard -> punchCard.evenCount() == 2,
                        punchCard -> punchCard.evenCount() == 3,
                };
                break;
            case 18:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue + punchCard.yellow + punchCard.purple % 2 == 0,
                        punchCard -> punchCard.blue + punchCard.yellow + punchCard.purple % 2 == 1,
                };
                break;
            case 19:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue + punchCard.yellow < 6,
                        punchCard -> punchCard.blue + punchCard.yellow == 6,
                        punchCard -> punchCard.blue + punchCard.yellow > 6,
                };
                break;
            case 20:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue == punchCard.yellow && punchCard.blue == punchCard.purple,
                        punchCard -> punchCard.uniquePair(),
                        punchCard -> punchCard.blue != punchCard.yellow
                                && punchCard.blue != punchCard.purple
                                && punchCard.yellow != punchCard.purple,
                };
                break;
            case 21:
                criterias = new Criteria[] {
                        punchCard -> !punchCard.uniquePair(),
                        punchCard -> punchCard.uniquePair(),
                };
                break;
            case 22:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < punchCard.yellow && punchCard.yellow < punchCard.purple,
                        punchCard -> punchCard.blue > punchCard.yellow && punchCard.yellow > punchCard.purple,
                        punchCard -> !(punchCard.blue < punchCard.yellow && punchCard.yellow < punchCard.purple)
                                && !(punchCard.blue > punchCard.yellow && punchCard.yellow > punchCard.purple)
                };
                break;
            case 23:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue + punchCard.yellow + punchCard.purple < 6,
                        punchCard -> punchCard.blue + punchCard.yellow + punchCard.purple == 6,
                        punchCard -> punchCard.blue + punchCard.yellow + punchCard.purple > 6,
                };
                break;
            case 24:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue + 1 == punchCard.yellow && punchCard.yellow + 1 == punchCard.purple,
                        punchCard -> punchCard.blue + 1 == punchCard.yellow ^ punchCard.yellow + 1 == punchCard.purple,
                        punchCard -> punchCard.blue + 1 != punchCard.yellow && punchCard.yellow + 1 != punchCard.purple,
                };
                break;
            case 25:
                criterias = new Criteria[] {
                        punchCard -> Math.abs(punchCard.blue - punchCard.yellow) != 1
                                && Math.abs(punchCard.yellow - punchCard.purple) != 1,
                        punchCard -> (Math.abs(punchCard.blue - punchCard.yellow) == 1
                                || Math.abs(punchCard.yellow - punchCard.purple) == 1)
                                && punchCard.blue - punchCard.yellow != punchCard.yellow - punchCard.purple,
                        punchCard -> Math.abs(punchCard.blue - punchCard.yellow) == 1
                                && punchCard.blue - punchCard.yellow == punchCard.yellow - punchCard.purple,
                };
                break;
            case 26:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < 3,
                        punchCard -> punchCard.yellow < 3,
                        punchCard -> punchCard.purple < 3,
                };
                break;
            case 27:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < 4,
                        punchCard -> punchCard.yellow < 4,
                        punchCard -> punchCard.purple < 4,
                };
                break;
            case 28:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue == 1,
                        punchCard -> punchCard.yellow == 1,
                        punchCard -> punchCard.purple == 1,
                };
                break;
            case 29:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue == 3,
                        punchCard -> punchCard.yellow == 3,
                        punchCard -> punchCard.purple == 3,
                };
                break;
            case 30:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue == 4,
                        punchCard -> punchCard.yellow == 4,
                        punchCard -> punchCard.purple == 4,
                };
                break;
            case 31:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue > 1,
                        punchCard -> punchCard.yellow > 1,
                        punchCard -> punchCard.purple > 1,
                };
                break;
            case 32:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue > 3,
                        punchCard -> punchCard.yellow > 3,
                        punchCard -> punchCard.purple > 3,
                };
                break;
            case 33:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue % 2 == 0,
                        punchCard -> punchCard.yellow % 2 == 0,
                        punchCard -> punchCard.purple % 2 == 0,
                        punchCard -> punchCard.blue % 2 == 1,
                        punchCard -> punchCard.yellow % 2 == 1,
                        punchCard -> punchCard.purple % 2 == 1,
                };
                break;
            case 34:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue <= punchCard.yellow && punchCard.blue <= punchCard.purple,
                        punchCard -> punchCard.yellow <= punchCard.blue && punchCard.yellow <= punchCard.purple,
                        punchCard -> punchCard.purple <= punchCard.blue && punchCard.purple <= punchCard.yellow,
                };
                break;
            case 35:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue >= punchCard.yellow && punchCard.blue >= punchCard.purple,
                        punchCard -> punchCard.yellow >= punchCard.blue && punchCard.yellow >= punchCard.purple,
                        punchCard -> punchCard.purple >= punchCard.blue && punchCard.purple >= punchCard.yellow,
                };
                break;
            case 36:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue + punchCard.yellow + punchCard.purple % 3 == 0,
                        punchCard -> punchCard.blue + punchCard.yellow + punchCard.purple % 4 == 0,
                        punchCard -> punchCard.blue + punchCard.yellow + punchCard.purple % 5 == 0,
                };
                break;
            case 37:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue + punchCard.yellow == 4,
                        punchCard -> punchCard.blue + punchCard.purple == 4,
                        punchCard -> punchCard.yellow + punchCard.purple == 4,
                };
                break;
            case 38:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue + punchCard.yellow == 6,
                        punchCard -> punchCard.blue + punchCard.purple == 6,
                        punchCard -> punchCard.yellow + punchCard.purple == 6,
                };
                break;
            case 39:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue == 1,
                        punchCard -> punchCard.yellow == 1,
                        punchCard -> punchCard.purple == 1,
                        punchCard -> punchCard.blue > 1,
                        punchCard -> punchCard.yellow > 1,
                        punchCard -> punchCard.purple > 1,
                };
                break;
            case 40:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < 3,
                        punchCard -> punchCard.yellow < 3,
                        punchCard -> punchCard.purple < 3,
                        punchCard -> punchCard.blue == 3,
                        punchCard -> punchCard.yellow == 3,
                        punchCard -> punchCard.purple == 3,
                        punchCard -> punchCard.blue > 3,
                        punchCard -> punchCard.yellow > 3,
                        punchCard -> punchCard.purple > 3,
                };
                break;
            case 41:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < 4,
                        punchCard -> punchCard.yellow < 4,
                        punchCard -> punchCard.purple < 4,
                        punchCard -> punchCard.blue == 4,
                        punchCard -> punchCard.yellow == 4,
                        punchCard -> punchCard.purple == 4,
                        punchCard -> punchCard.blue > 4,
                        punchCard -> punchCard.yellow > 4,
                        punchCard -> punchCard.purple > 4,
                };
                break;
            case 42:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < punchCard.yellow && punchCard.blue < punchCard.purple,
                        punchCard -> punchCard.yellow < punchCard.blue && punchCard.yellow < punchCard.purple,
                        punchCard -> punchCard.purple < punchCard.blue && punchCard.purple < punchCard.yellow,
                        punchCard -> punchCard.blue > punchCard.yellow && punchCard.blue > punchCard.purple,
                        punchCard -> punchCard.yellow > punchCard.blue && punchCard.yellow > punchCard.purple,
                        punchCard -> punchCard.purple > punchCard.blue && punchCard.purple > punchCard.yellow,
                };
                break;
            case 43:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < punchCard.yellow,
                        punchCard -> punchCard.blue == punchCard.yellow,
                        punchCard -> punchCard.blue > punchCard.yellow,
                        punchCard -> punchCard.blue < punchCard.purple,
                        punchCard -> punchCard.blue == punchCard.purple,
                        punchCard -> punchCard.blue > punchCard.purple,
                };
                break;
            case 44:
                criterias = new Criteria[] {
                        punchCard -> punchCard.yellow < punchCard.blue,
                        punchCard -> punchCard.yellow == punchCard.blue,
                        punchCard -> punchCard.yellow > punchCard.blue,
                        punchCard -> punchCard.yellow < punchCard.purple,
                        punchCard -> punchCard.yellow == punchCard.purple,
                        punchCard -> punchCard.yellow > punchCard.purple,
                };
                break;
            case 45:
                criterias = new Criteria[] {
                        punchCard -> punchCard.nCount(1) == 0,
                        punchCard -> punchCard.nCount(1) == 1,
                        punchCard -> punchCard.nCount(1) == 2,
                        punchCard -> punchCard.nCount(1) == 3,
                        punchCard -> punchCard.nCount(3) == 0,
                        punchCard -> punchCard.nCount(3) == 1,
                        punchCard -> punchCard.nCount(3) == 2,
                        punchCard -> punchCard.nCount(3) == 3,
                };
                break;
            case 46:
                criterias = new Criteria[] {
                        punchCard -> punchCard.nCount(3) == 0,
                        punchCard -> punchCard.nCount(3) == 1,
                        punchCard -> punchCard.nCount(3) == 2,
                        punchCard -> punchCard.nCount(3) == 3,
                        punchCard -> punchCard.nCount(4) == 0,
                        punchCard -> punchCard.nCount(4) == 1,
                        punchCard -> punchCard.nCount(4) == 2,
                        punchCard -> punchCard.nCount(4) == 3,
                };
                break;
            case 47:
                criterias = new Criteria[] {
                        punchCard -> punchCard.nCount(1) == 0,
                        punchCard -> punchCard.nCount(1) == 1,
                        punchCard -> punchCard.nCount(1) == 2,
                        punchCard -> punchCard.nCount(1) == 3,
                        punchCard -> punchCard.nCount(4) == 0,
                        punchCard -> punchCard.nCount(4) == 1,
                        punchCard -> punchCard.nCount(4) == 2,
                        punchCard -> punchCard.nCount(4) == 3,
                };
                break;
            case 48:
                criterias = new Criteria[] {
                        punchCard -> punchCard.blue < punchCard.yellow,
                        punchCard -> punchCard.blue < punchCard.purple,
                        punchCard -> punchCard.yellow < punchCard.purple,
                        punchCard -> punchCard.blue == punchCard.yellow,
                        punchCard -> punchCard.blue == punchCard.purple,
                        punchCard -> punchCard.yellow == punchCard.purple,
                        punchCard -> punchCard.blue > punchCard.yellow,
                        punchCard -> punchCard.blue > punchCard.purple,
                        punchCard -> punchCard.yellow > punchCard.purple,
                };
                break;
            default:
            //TODO: create custom exception
                throw new IllegalArgumentException("Invalid criteria card id");
        }
        return new CriteriaCard(id, testedCriteria, criterias);
    }
}
