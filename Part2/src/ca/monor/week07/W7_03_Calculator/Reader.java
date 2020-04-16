package ca.monor.week07.W7_03_Calculator;

import java.util.Scanner;

public class Reader {
    private Scanner scanner = new Scanner(System.in);

    public String readString() {
        return scanner.nextLine();
    }
    public int readInteger() {
        return Integer.parseInt(scanner.nextLine());
    }
}
