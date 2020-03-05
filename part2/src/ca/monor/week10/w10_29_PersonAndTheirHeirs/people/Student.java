package ca.monor.week10.w10_29_PersonAndTheirHeirs.people;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
    }

    public int credits() {
        return credits;
    }

    public void study() {
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  credits " + this.credits;
    }
}
