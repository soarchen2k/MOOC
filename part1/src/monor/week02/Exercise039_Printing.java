package monor.week02;

public class Exercise039_Printing {
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.printf("*");
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
        // 39.2
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
        // 39.3
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
        // 39.4
    }

    public static void main(String[] args) {
        // Tests do not use Main, yo can write code here freely!
        // if you have problems with tests, please try out first
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }
}
