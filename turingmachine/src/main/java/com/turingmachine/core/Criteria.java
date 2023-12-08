package com.turingmachine.core;

import java.util.ArrayList;
import java.util.function.Function;


public class Criteria {
    private ArrayList<Function<PunchCard, Boolean>> criteriaList;   

    public Criteria() {
        this.criteriaList = new ArrayList<>();

    }

}
