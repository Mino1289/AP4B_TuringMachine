package com.turingmachine.core;

@FunctionalInterface
public interface Criteria {
    boolean verify(PunchCard punchCard);
}
