package ca.monor.week09.W9_21_Printer.cours.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        File names = new File("part2/src/ca/monor/week09/W9_21_Printer/cours/fileReader/names.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(names);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("No Such File");
        }

        assert scanner != null;
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }


}
