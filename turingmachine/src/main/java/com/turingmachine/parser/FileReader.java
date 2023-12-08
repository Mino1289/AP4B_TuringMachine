package com.turingmachine.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private String filename;

    public FileReader(String _filename) {
        this.filename = _filename;
    }

    public Scanner readFile() throws FileNotFoundException {
        try {
            File file = new File(this.filename);
            return new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("An error occured");
            e.printStackTrace();
            return null;
        }
    }

    public String readLine(Scanner scanner) {
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            closeFile(scanner);
            return null;
        }
    }

    public Boolean hasNextLine(Scanner scanner) {
        return scanner.hasNextLine();
    }

    public void closeFile(Scanner scanner) {
        scanner.close();
    }
}
