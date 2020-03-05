package ca.monor.week08.W8_10_NationalService.coursInterface_40;

public class Main {
    public static void main(String[] args) {
        NumberList joelList = new NumberList();
        for (int i = 0; i < 1000; i++) {
            joelList.add(new SMS("matti", "have you already written the tests?"));
        }

        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
        System.out.println("Let's delegate some reading to Mikael");

        NumberList mikaelList = new NumberList();
        mikaelList.add(joelList);
        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
        System.out.println(mikaelList.howManyReadables());
        mikaelList.read();

        System.out.println();
        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
    }
}
