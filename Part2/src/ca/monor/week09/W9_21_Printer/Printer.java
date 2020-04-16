package ca.monor.week09.W9_21_Printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    private File file;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        Scanner scanner = new Scanner(this.file);
        String sentences = "";
        if (word.equals("")) {
            while (scanner.hasNextLine()) {
                sentences += scanner.nextLine() + "\n";
            }
            System.out.println(sentences);
        } else {
            while (scanner.hasNextLine()) {
                sentences = scanner.nextLine();
                if (sentences.contains(word)) {
                    System.out.println(sentences);
                }
            }
        }
    }
}
