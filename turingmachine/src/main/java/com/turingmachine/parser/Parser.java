package com.turingmachine.parser;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.turingmachine.util.FileLiterator;

public class Parser {
    protected FileLiterator fileReader;
    protected Scanner scanner;

    public Parser(String filename) {
        this.fileReader = new FileLiterator(filename);
        try {
            this.scanner = fileReader.readFile();
        } catch (FileNotFoundException e) {
            System.err.println("An error occured");
            e.printStackTrace();
        }  
    }

    public String[] tokenize(String rawString, String sep) {
        String[] tokens = rawString.split(sep);
        return tokens;
    }
}
