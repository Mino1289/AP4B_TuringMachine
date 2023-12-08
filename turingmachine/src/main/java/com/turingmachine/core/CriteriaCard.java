package com.turingmachine.core;

public class CriteriaCard {
    private Integer id;
        

    public CriteriaCard(Integer _id) {
        this.id = _id;
    }

    public Boolean test(PunchCard punchCard, PunchCard answer) {
        
        return true;
    }
}
