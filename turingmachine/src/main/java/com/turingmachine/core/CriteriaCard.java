package com.turingmachine.core;

public class CriteriaCard {
    private Integer id;

    public CriteriaCard(Integer _id) {
        this.id = _id;
    }

    public boolean test(PunchCard punchCard, PunchCard answer) {
        switch (id) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            case 29:
                break;
            case 31:
                break;
            case 32:
                break;
            case 33:
                break;
            case 34:
                break;
            case 35:
                break;
            case 36:
                break;
            case 37:
                break;
            case 38:
                break;
            case 39:
                break;
            case 41:
                break;
            case 42:
                break;
            case 43:
                break;
            case 44:
                break;
            case 45:
                break;
            case 46:
                break;
            case 47:
                break;
            case 48:
                break;
            default:
                break;
        }

        return true;
    }

    private boolean function1(PunchCard punchCard, PunchCard answer) {
        if (answer.blue == 1) {
            return (punchCard.blue == 1);
        } else {
            return (punchCard.blue > 1);
        }
    }

    private boolean function2(PunchCard punchCard, PunchCard answer) {
        if (answer.blue < 3) {
            return (punchCard.blue < 3);
        } else if (answer.blue == 3) {
            return (punchCard.blue == 3);
        } else {
            return (punchCard.blue > 3);
        }
    }

    private boolean function3(PunchCard punchCard, PunchCard answer) {
        if (answer.yellow < 3) {
            return (punchCard.yellow < 3);
        } else if (answer.yellow == 3) {
            return (punchCard.yellow == 3);
        } else {
            return (punchCard.yellow > 3);
        }
    }

    private boolean function4(PunchCard punchCard, PunchCard answer) {
        if (answer.yellow < 4) {
            return (punchCard.yellow < 4);
        } else if (answer.yellow == 4) {
            return (punchCard.yellow == 4);
        } else {
            return (punchCard.yellow > 4);
        }
    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {
        if (answer.blue % 2 == 0) {
            return (punchCard.blue % 2 == 0);
        } else {
            return (punchCard.blue % 2 == 1);
        }
    }

    private boolean function6(PunchCard punchCard, PunchCard answer) {
        if (answer.yellow % 2 == 0) {
            return (punchCard.yellow % 2 == 0);
        } else {
            return (punchCard.yellow % 2 == 1);
        }
    }

    private boolean function7(PunchCard punchCard, PunchCard answer) {
        if (answer.purple % 2 == 0) {
            return (punchCard.purple % 2 == 0);
        } else {
            return (punchCard.purple % 2 == 1);
        }
    }

    private boolean function8(PunchCard punchCard, PunchCard answer) {
        int guessOneCount = (answer.blue == 1 ? 1 : 0) +
                (answer.yellow == 1 ? 1 : 0) +
                (answer.purple == 1 ? 1 : 0);

        int answerOneCount = (punchCard.blue == 1 ? 1 : 0) +
                (punchCard.yellow == 1 ? 1 : 0) +
                (punchCard.purple == 1 ? 1 : 0);

        return guessOneCount == answerOneCount;
    }

    private boolean function9(PunchCard punchCard, PunchCard answer) {
        int answerOneCount = (answer.blue == 3 ? 1 : 0) +
                (answer.yellow == 3 ? 1 : 0) +
                (answer.purple == 3 ? 1 : 0);

        int guessOneCount = (punchCard.blue == 3 ? 1 : 0) +
                (punchCard.yellow == 3 ? 1 : 0) +
                (punchCard.purple == 3 ? 1 : 0);

        return guessOneCount == answerOneCount;
    }

    private boolean function10(PunchCard punchCard, PunchCard answer) {
        int answerOneCount = (answer.blue == 4 ? 1 : 0) +
                (answer.yellow == 4 ? 1 : 0) +
                (answer.purple == 4 ? 1 : 0);

        int guessOneCount = (punchCard.blue == 4 ? 1 : 0) +
                (punchCard.yellow == 4 ? 1 : 0) +
                (punchCard.purple == 4 ? 1 : 0);

        return guessOneCount == answerOneCount;
    }

    private boolean function11(PunchCard punchCard, PunchCard answer) {
        if (answer.blue < answer.yellow) {
            return (punchCard.blue < punchCard.yellow);
        } else if (answer.blue == answer.yellow) {
            return (punchCard.blue == punchCard.yellow);
        } else {
            return (punchCard.blue > punchCard.yellow);
        }
    }

    private boolean function12(PunchCard punchCard, PunchCard answer) {
        if (answer.blue < answer.purple) {
            return (punchCard.blue < punchCard.purple);
        } else if (answer.blue == answer.purple) {
            return (punchCard.blue == punchCard.purple);
        } else {
            return (punchCard.blue > punchCard.purple);
        }
    }

    private boolean function13(PunchCard punchCard, PunchCard answer) {
        if (answer.yellow < answer.purple) {
            return (punchCard.yellow < punchCard.purple);
        } else if (answer.yellow == answer.purple) {
            return (punchCard.yellow == punchCard.purple);
        } else {
            return (punchCard.yellow > punchCard.purple);
        }
    }

    private boolean function14(PunchCard punchCard, PunchCard answer) {
        if (answer.blue < answer.purple && answer.blue < answer.yellow) {
            return (punchCard.blue < punchCard.purple && punchCard.blue < punchCard.yellow);
        } else if (answer.yellow < answer.blue && answer.yellow < answer.purple) {
            return (punchCard.yellow < punchCard.blue && punchCard.yellow < punchCard.purple);
        } else {
            return (punchCard.purple < punchCard.blue && punchCard.purple < punchCard.yellow);
        }
    }

    private boolean function15(PunchCard punchCard, PunchCard answer) {
        if (answer.blue > answer.purple && answer.blue > answer.yellow) {
            return (punchCard.blue > punchCard.purple && punchCard.blue > punchCard.yellow);
        } else if (answer.yellow > answer.blue && answer.yellow > answer.purple) {
            return (punchCard.yellow > punchCard.blue && punchCard.yellow > punchCard.purple);
        } else {
            return (punchCard.purple > punchCard.blue && punchCard.purple > punchCard.yellow);
        }
    }

    private boolean function16(PunchCard punchCard, PunchCard answer) {
        int guessEvenCount = (punchCard.blue % 2 == 0 ? 1 : 0) +
                (punchCard.yellow % 2 == 0 ? 1 : 0) +
                (punchCard.purple % 2 == 0 ? 1 : 0);

        int answerEvenCount = (answer.blue % 2 == 0 ? 1 : 0) +
                (answer.yellow % 2 == 0 ? 1 : 0) +
                (answer.purple % 2 == 0 ? 1 : 0);

        if (answerEvenCount > 2) {
            return guessEvenCount > 1;
        } else {
            return guessEvenCount < 2;
        }
    }

    private boolean function17(PunchCard punchCard, PunchCard answer) {
        int guessEvenCount = (punchCard.blue % 2 == 0 ? 1 : 0) +
                (punchCard.yellow % 2 == 0 ? 1 : 0) +
                (punchCard.purple % 2 == 0 ? 1 : 0);

        int answerEvenCount = (answer.blue % 2 == 0 ? 1 : 0) +
                (answer.yellow % 2 == 0 ? 1 : 0) +
                (answer.purple % 2 == 0 ? 1 : 0);

        return guessEvenCount == answerEvenCount;
    }

    private boolean function18(PunchCard punchCard, PunchCard answer) {
        int answerSum = answer.blue + answer.yellow + answer.purple;
        int guessSum = punchCard.blue + punchCard.yellow + punchCard.purple;

        if (answerSum % 2 == 0) {
            return guessSum % 2 == 0;
        } else {
            return guessSum % 2 == 1;
        }
    }

    private boolean function19(PunchCard punchCard, PunchCard answer) {
        if (answer.blue + answer.yellow < 6) {
            return (punchCard.blue + punchCard.yellow < 6);
        } else if (answer.blue + answer.yellow == 6) {
            return (punchCard.blue + punchCard.yellow == 6);
        } else {
            return (punchCard.blue + punchCard.yellow > 6);
        }

    }

    private boolean function20(PunchCard punchCard, PunchCard answer) {
        if (answer.blue == answer.yellow && answer.blue == answer.purple) {
            return (punchCard.blue == punchCard.yellow && punchCard.blue == punchCard.purple);
        } else if (answer.blue == answer.yellow || answer.blue == answer.purple || answer.yellow == answer.purple) {
            return (punchCard.blue == punchCard.yellow || punchCard.blue == punchCard.purple
                    || punchCard.yellow == punchCard.purple);
        } else {
            return (punchCard.blue != punchCard.yellow && punchCard.blue != punchCard.purple
                    && punchCard.yellow != punchCard.purple);
        }
    }

    private boolean function21(PunchCard punchCard, PunchCard answer) {
        if ((answer.blue == answer.yellow && answer.blue != answer.purple)
                || (answer.blue == answer.purple && answer.blue != answer.yellow)
                || (answer.yellow == answer.purple && answer.yellow != answer.blue)) {
            return ((punchCard.blue == punchCard.yellow && punchCard.blue != punchCard.purple)
                    || (punchCard.blue == punchCard.purple && punchCard.blue != punchCard.yellow)
                    || (punchCard.yellow == punchCard.purple && punchCard.yellow != punchCard.blue));
        } else {
            return ((punchCard.blue == punchCard.yellow && punchCard.blue == punchCard.purple) ||
                    (punchCard.blue != punchCard.yellow && punchCard.blue != punchCard.purple
                            && punchCard.yellow != punchCard.purple));
        }
    }

    private boolean function22(PunchCard punchCard, PunchCard answer) {
        if (answer.blue < answer.yellow && answer.yellow < answer.purple) {
            return (punchCard.blue < punchCard.yellow && punchCard.yellow < punchCard.purple);
        } else if (answer.blue > answer.yellow && answer.yellow > answer.purple) {
            return (punchCard.blue > punchCard.yellow && punchCard.yellow > punchCard.purple);
        } else {
            return (punchCard.blue >= punchCard.yellow && punchCard.yellow < punchCard.purple
                    || punchCard.blue <= punchCard.yellow && punchCard.yellow > punchCard.purple);
        }
    }

    private boolean function23(PunchCard punchCard, PunchCard answer) {
        int answerSum = answer.blue + answer.yellow + answer.purple;
        int guessSum = punchCard.blue + punchCard.yellow + punchCard.purple;

        if (answerSum < 6) {
            return guessSum < 6;
        } else if (answerSum == 6) {
            return guessSum == 6;
        } else {
            return guessSum > 6;
        }

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }

    private boolean function5(PunchCard punchCard, PunchCard answer) {

    }
}
