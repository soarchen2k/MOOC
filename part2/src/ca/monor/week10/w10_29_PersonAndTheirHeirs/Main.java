package ca.monor.week10.w10_29_PersonAndTheirHeirs;

import ca.monor.week10.w10_29_PersonAndTheirHeirs.people.Person;
import ca.monor.week10.w10_29_PersonAndTheirHeirs.people.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);

        Object liisa = new Student("Liisa", "Väinö Auerin Street 20 00500 Helsinki");
        System.out.println( liisa );
    }

    public static void printDepartment(List<Person> people) {
        for (Person p : people) System.out.println(p);
    }
}
