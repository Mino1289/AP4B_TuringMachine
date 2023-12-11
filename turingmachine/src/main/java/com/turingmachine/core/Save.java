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

    public int getProblemId() {
        return this.problemId;
    }

    public int getTestCount() {
        return this.testCount;
    }

    public String getUsername() {
        return this.username;
    }

    public void updateTestCount(int _testCount) {
        if (0 <= _testCount && _testCount < this.testCount)
            this.testCount = _testCount;
    }
}
