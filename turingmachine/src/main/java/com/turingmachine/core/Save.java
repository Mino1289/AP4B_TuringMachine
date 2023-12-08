package com.turingmachine.core;

public class Save {
    private Integer problemId;
    private Integer testCount;
    private String username;

    public Save(Integer _problemId, Integer _testCount, String _username) {
        this.problemId = _problemId;
        this.testCount = _testCount;
        this.username = _username;
    }
}
