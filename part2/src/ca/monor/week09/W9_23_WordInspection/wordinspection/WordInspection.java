package ca.monor.week09.W9_23_WordInspection.wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private Scanner scanner;
    private List<String> words = new ArrayList<String>();

    public WordInspection(File file) throws FileNotFoundException {  //将 文件 装入数组
        this.scanner = new Scanner(file, "UTF-8");
        while (this.scanner.hasNextLine()) {
            this.words.add(this.scanner.nextLine());
        }
    }

    public int wordCount() {  //返回数组长度，即可得到单词数量
        return this.words.size();
    }

    public List<String> wordsContainingZ() {
        List<String> zWords = new ArrayList<String>();
        for (String z :
                this.words) {
            if (z.contains("z")) {  //判断是否包含 z
                zWords.add(z);
            }
        }
        return zWords;
    }

    public List<String> wordsEndingInL() {
        List<String> containsL = new ArrayList<String>();
        for (String l :
                this.words) {
            if (l.endsWith("l")) {  //判断是否以 l 结尾
                containsL.add(l);
            }
        }
        return containsL;
    }

    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        for (String p :
                this.words) {
            if (isPalindromes2(p)) {  //通过方法判断是否为回文
                palindromes.add(p);
            }
        }
        return palindromes;
    }

    public static boolean isPalindromes(String string) {
        if (string.isEmpty()) {
            return false;
        }
        for (int i = 0; i < string.length() / 2; i++) {
            if (!(string.charAt(i) == string.charAt(string.length() - i - 1))) {
                return false;  //如果相应位置上的字母不相等，则不是回文
            }
        }
        return true;
    }

    public static boolean isPalindromes2(String string) {
        if (string.isEmpty()) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.contentEquals(stringBuilder.reverse());  //如果单词翻转后仍等于其本身，则是回文
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> containAllVowels = new ArrayList<String>();
        for (String v :
                this.words) {
            if (containAllVowels(v)) {
                containAllVowels.add(v);
            }
        }
        return containAllVowels;
    }

    private boolean containAllVowels(String p) {
        if (p.contains("a") && p.contains("e") && p.contains("i")
                && p.contains("o") && p.contains("u") && p.contains("y")
                && p.contains("ä") && p.contains("ö")) {
            return true;
        }
        return false;
    }
}
