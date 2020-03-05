package monor.week06.exercise094_PhoneBook;

public class Person {
    private String name;
    private String number;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name +" number: " + number;
    }
}
