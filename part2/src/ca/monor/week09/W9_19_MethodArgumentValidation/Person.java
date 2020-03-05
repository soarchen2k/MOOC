package ca.monor.Week09.W9_19_MethodArgumentValidation;

public class Person {
    private String name;
    private int age;

    public void scanAge(int age) {
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Age is illegal");
            }
    }

    public void scanName(String name) {
            if (name == null || name.isEmpty() || name.length() > 40) {
                throw new IllegalArgumentException("Name is illegal");
            }
    }

    public Person() {
    }

    public Person(String name, int age) {
        scanAge(age);
        scanName(name);
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        scanName(name);
        this.name = name;
    }

    public Person(int age) {
        scanAge(age);
        this.age = age;
    }

    public void setName(String name) {
        scanName(name);
        this.name = name;
    }

    public void setAge(int age) {
        scanAge(age);
        this.age = age;
    }

    @Override
    public String toString() {
        scanAge(this.age);
        scanName(this.name);
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
