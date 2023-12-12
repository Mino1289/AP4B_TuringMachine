package com.turingmachine.parser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.turingmachine.core.Save;
import com.turingmachine.util.FileLiterator;

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

        while (fileLiterator.hasNextLine(scanner)) {
            String rawString = fileLiterator.readLine(scanner);
            Save save = parseSave(rawString);
            saves.add(save);
        }
        return saves;
    }

    public void writeSaves(ArrayList<Save> saves, String sep) {
        FileWriter fileWriter = super.fileLiterator.writeFile();
        for (Save save : saves) {
            String rawString = save.getProblemId() + sep + save.getTestCount() + sep + save.getUsername();
            try {
                super.fileLiterator.writeLine(fileWriter, rawString);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                return;
            }
        }
    }
}