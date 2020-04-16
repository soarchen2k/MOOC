package ca.monor.week09.W9_21_Printer;

public class Main {
    public static void main(String[] args) throws Exception {
        Printer2 printer = new Printer2("part2/src/ca/monor/week09/W9_21_Printer/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
