package ca.monor.week10.w10_28_Groups.cours.objectPolymorphism;

public class Main {
    public static void main(String[] args) {
//        Object string = "string";
//        String string1 = (String) string;
//        System.out.println(string);
//        System.out.println(string1);
//        System.out.println(string1==string);
//        printMultiTimes(string, 3);
//        printMultiTimes(string1, 9);
//        Person person = new Person("Kane", 27);
//        printMultiTimes(person, 5);
        CharSequence charSequenceString = "string";
        System.out.println(charSequenceString);
    }

    public static void printMultiTimes(Object o, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(o.toString());
        }
    }
}
