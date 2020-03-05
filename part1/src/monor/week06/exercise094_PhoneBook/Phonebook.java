package monor.week06.exercise094_PhoneBook;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();

    public void add(String name, String number) {
        list.add(new Person(name, number));
    }

    public void printAll() {
        for (Person next : list) {
            System.out.println(next);
        }
    }

    public String searchNumber(String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
