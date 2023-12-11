package com.turingmachine.parser;

import java.util.ArrayList;

import com.turingmachine.core.Save;

public class SaveParser extends Parser {
    public SaveParser(String filename) {
        super(filename);
    }
    
    public Save parseSave(String rawString) {
        //problemId;testCount;username
        //        1;        3;"username"
        //1;3;username
        //extracted string looks like this ^
        String[] tokens = super.tokenize(rawString, ";");
        int problemId = Integer.parseInt(tokens[0]);
        int testCount = Integer.parseInt(tokens[1]);
        String username = tokens[2];
        
        return new Save(problemId, testCount, username);
    }

    public ArrayList<Save> getSaves(String filename) {
        ArrayList<Save> saves = new ArrayList<Save>();

        while (fileReader.hasNextLine(scanner)) {
            String rawString = fileReader.readLine(scanner);
            Save save = parseSave(rawString);
            saves.add(save);
        }
        return saves;
    }
}
