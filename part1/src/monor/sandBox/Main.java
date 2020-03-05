package monor.sandBox;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("AA", 27, 75, 178);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getHeight());
        System.out.println(person1.getWeight());
        System.out.println(person1.hashCode());
    }
}
