package com.turingmachine.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

    public boolean hasNextLine(Scanner scanner) {
        return scanner.hasNextLine();
    }

    public void closeFile(Scanner scanner) {
        scanner.close();
    }

    public FileWriter writeFile() {
        try {
            File f = new File(this.filename);
            if (!f.createNewFile()) {
                // delete the file and create a new one
                f.delete();
                f.createNewFile();
            }
            return new FileWriter(this.filename);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
    public void writeLine(FileWriter fileWriter, String line) throws IOException {
        fileWriter.write(line);
    }
}