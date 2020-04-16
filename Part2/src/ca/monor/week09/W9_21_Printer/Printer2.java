package ca.monor.week09.W9_21_Printer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer2 {
    private List<String> text = new ArrayList<String>();

    public Printer2(String file) throws Exception {
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()) {
            this.text.add(scanner.nextLine());
        }
    }

    public void printLinesWhichContain(String word) {
        for (String s :
                text) {
            if (s.contains(word) || s.isEmpty()) {
                System.out.println(s);
            }
        }
    }
}
