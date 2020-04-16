package ca.monor.week08.W8_14_StudentsSortedByName;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.name.compareToIgnoreCase(o.getName()), 0);
    }
}
