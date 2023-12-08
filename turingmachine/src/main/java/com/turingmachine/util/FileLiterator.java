package com.turingmachine.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// TODO: Add the writing part
public class FileLiterator {
    private String filename;

    public FileLiterator(String _filename) {
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
