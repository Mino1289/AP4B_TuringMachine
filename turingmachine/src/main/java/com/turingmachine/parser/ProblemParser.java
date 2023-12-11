package com.turingmachine.parser;

import java.util.ArrayList;

import com.turingmachine.core.Problem;
import com.turingmachine.core.PunchCard;

public class ProblemParser extends Parser {

    public ProblemParser(String filename) {
        super(filename);
    }
    
    private Problem parseProblem(String rawString) {
        //id;nbr of criteria;criteria ids;answer
        // 1;       4;     4; 9; 11; 14; 241
        // 1;4;4;9;11;14;241
        // extracted string looks like this ^
        String[] tokens = super.tokenize(rawString, ";");

        int id = Integer.parseInt(tokens[0]);
        int nbrOfCriteria = Integer.parseInt(tokens[1]);

        ArrayList<Integer> criteriaIds = new ArrayList<Integer>();
        for (int i = 0; i < nbrOfCriteria; i++) {
            int criteriaId = Integer.parseInt(tokens[2 + i]);
            criteriaIds.add(criteriaId);
        }

        int answerInt = Integer.parseInt(tokens[2 + nbrOfCriteria]);
        PunchCard answer = new PunchCard(answerInt);

        Problem problem = new Problem(id, criteriaIds, answer);
        return problem;
    }

    public ArrayList<Problem> getProblems(String filename) {
        ArrayList<Problem> problems = new ArrayList<Problem>();

        while (fileReader.hasNextLine(scanner)) {
            String rawString = fileReader.readLine(scanner);
            Problem problem = parseProblem(rawString);
            problems.add(problem);
        }
        return problems;
    }
}
