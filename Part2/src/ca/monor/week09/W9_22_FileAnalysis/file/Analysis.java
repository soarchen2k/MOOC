package ca.monor.week09.W9_22_FileAnalysis.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Analysis {
    private Scanner scanner;
    private ArrayList<String> texts;

    public Analysis(File file) throws FileNotFoundException {
        this.scanner = new Scanner(file);
        this.texts = new ArrayList<String>();
        while (this.scanner.hasNextLine()) {
            this.texts.add(this.scanner.nextLine() + "\n");
        }
    }

    public int lines() {
        return this.texts.size();
    }

    public int characters() {
        int length = 0;
        for (String s :
                this.texts) {
            length += s.length();
        }
        return length;
    }
}
