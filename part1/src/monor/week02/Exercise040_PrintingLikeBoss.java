package monor.week02;

public class Exercise040_PrintingLikeBoss {
    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.printf("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        for (int i = amount ; i > 0; i--) {
            System.out.printf(" ");
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printWhitespaces(height - i - 1);
            printStars(i * 2 + 1);
        }

        for (int i = 0; i < 2; i++) {
            printWhitespaces(height - 2);
            printStars(3);
        }
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use Main, yo can write code here freely!

        printTriangle(1);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
