package monor.week05.exercise088_Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                for (Student s :
                        students) {
                    System.out.println(s);
                }
                System.out.print("Give search term: ");
                String search = scanner.nextLine();
                System.out.println("Result: ");
                for (Student student : students) {
                    if (student.getName().contains(search)) {
                        System.out.println(student);
                    }
                }
                break;
            } else {
                System.out.print("Student Number: ");
                String number = scanner.nextLine();
                students.add(new Student(name, number));
            }
        }
    }
}
