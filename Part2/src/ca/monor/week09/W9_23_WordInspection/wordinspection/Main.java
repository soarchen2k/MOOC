package ca.monor.week09.W9_23_WordInspection.wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordInspection wordInspection = new WordInspection(new
                File("part2/src/ca/monor/week09/W9_23_WordInspection/src/wordList.txt"));
        System.out.println(wordInspection.wordCount());
        System.out.println(wordInspection.wordsContainingZ());
        System.out.println(wordInspection.wordsEndingInL());
        System.out.println(wordInspection.palindromes());
        System.out.println(wordInspection.wordsWhichContainAllVowels());
    }
}
