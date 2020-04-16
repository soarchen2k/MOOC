package ca.monor.week08.W8_13_RichFirstPoorLast;

public class Person implements Comparable<Person>{
    private String name;
    private int salary;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(other.getSalary(), this.salary);
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }
}
