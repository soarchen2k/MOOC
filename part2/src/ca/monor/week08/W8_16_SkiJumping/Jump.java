package ca.monor.week08.W8_16_SkiJumping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jump {

    private Scanner scanner = new Scanner(System.in);
    private List<Person> persons = new ArrayList<Person>();
    private int round;

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        addPerson();
        startJump();
        showResult();
    }

    private void addPerson() {
        System.out.println("Write the names of the participants one at a time; " +
                "an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                return;
            } else {
                persons.add(new Person(name));
            }
        }
    }

    private void startJump() {
        System.out.println("The tournament begins!");
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("jump")) {
                round++;
                System.out.println("");
                System.out.println("Round " + round);
                System.out.println("");
                showJumpingOrder();
                for (Person p :
                        persons) {
                    p.jump();
                    p.judge();
                    p.setPoints();
                }
                showRoundResult();
            } else if (command.equalsIgnoreCase("quit")
                    || command.equals("")) {
                return;
            }
        }
    }

    private void showRoundResult() {
        System.out.println("Results of round " + round);
        for (Person value : persons) {
            System.out.println("  " + value.getName());
            System.out.println("    length: " + value.getLength());
            value.printJudgeVotes();
        }
    }

    private void showJumpingOrder() {
        Collections.sort(persons);
        System.out.println("Jumping order:");
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            System.out.println("  " + (i + 1) + ". "+p);
        }
        System.out.println("");
    }

    private void showResult() {
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        printPosition();
    }

    public void printPosition() {
        persons.sort(new ReversPersons());
        for (int i = 0; i < this.persons.size(); i++) {
            System.out.println((i + 1) + "           " + this.persons.get(i));
            System.out.print("            jump lengths: ");
            this.persons.get(i).printLengths();
            System.out.println("");
        }
    }
}
