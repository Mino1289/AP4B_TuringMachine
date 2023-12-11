package com.turingmachine.core;

public class Save {
    private int problemId;
    private int testCount;
    private String username;

    public Save(int _problemId, int _testCount, String _username) {
        this.problemId = _problemId;
        this.testCount = _testCount;
        this.username = _username;
    }
}
