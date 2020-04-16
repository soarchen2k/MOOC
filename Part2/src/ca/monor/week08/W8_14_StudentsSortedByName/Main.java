package ca.monor.week08.W8_14_StudentsSortedByName;

public class Main {
    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
    }
}
