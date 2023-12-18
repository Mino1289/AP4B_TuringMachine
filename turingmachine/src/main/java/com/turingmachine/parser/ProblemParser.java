package com.turingmachine.parser;

import java.util.ArrayList;

import com.turingmachine.core.CriteriaCard;
import com.turingmachine.core.CriteriaCardGenerator;
import com.turingmachine.core.Problem;
import com.turingmachine.core.PunchCard;

public class ProblemParser extends Parser {

    public ProblemParser(String filename) {
        super(filename);
    }
    
    private Problem parseProblem(String rawString) {
        //id;nbr of criteria;criteria1:idx2; criteria2:idx2;...;answer

        String[] tokens = super.tokenize(rawString, ";");

        int id = Integer.parseInt(tokens[0]);
        int nbrOfCriteria = Integer.parseInt(tokens[1]);

        ArrayList<CriteriaCard> criterias = new ArrayList<CriteriaCard>();
        for (int i = 0; i < nbrOfCriteria; i++) {
            String[] criteriaTokens = super.tokenize(tokens[2 + i], ":");
            int criteriaId = Integer.parseInt(criteriaTokens[0]);
            int criteriaIdx = Integer.parseInt(criteriaTokens[1]);
            CriteriaCard critCard = CriteriaCardGenerator.generateCriteriaCard(criteriaId, criteriaIdx);
            criterias.add(critCard);
        }

        int answerInt = Integer.parseInt(tokens[2 + nbrOfCriteria]);
        PunchCard answer = new PunchCard(answerInt);

        Problem problem = new Problem(id, criterias, answer);
        return problem;
    }

    public ArrayList<Problem> getProblems() {
        ArrayList<Problem> problems = new ArrayList<Problem>();

        while (fileLiterator.hasNextLine(super.scanner)) {
            String rawString = fileLiterator.readLine(super.scanner);
            Problem problem = parseProblem(rawString);
            problems.add(problem);
        }
        return problems;
    }
}