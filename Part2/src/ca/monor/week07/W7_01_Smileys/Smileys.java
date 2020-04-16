package ca.monor.week07.W7_01_Smileys;

public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface of Java Language");
    }

    private static void printWithSmileys(String word) {
        int length = ((word.length() + 1) / 2) + 3;
        printSmileys(length);
        printWord(word);
        printSmileys(length);
    }

    private static void printWord(String word) {
        System.out.print(":) ");
        System.out.print(word.length() % 2 == 0 ? word : word + " ");
        System.out.println(" :)");
    }

    private static void printSmileys(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }
}
