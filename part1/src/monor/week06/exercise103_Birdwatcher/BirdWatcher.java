package monor.week06.exercise103_Birdwatcher;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdWatcher {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Bird> birds;

    public BirdWatcher() {
        birds = new ArrayList<Bird>();
    }

    public void runner() {
        while (true) {
            System.out.print("?");
            String command = scanner.nextLine();
            command = command.toUpperCase();
            if (command.equals("ADD")) {
                this.add();
            }
            if (command.equals("STATISTICS")) {
                this.statistics();
            }
            if (command.equals("OBSERVATION")) {
                System.out.print("What was observed:? ");
                this.observation(scanner.nextLine());
            }
            if (command.equals("SHOW")) {
                System.out.print("What? ");
                this.show(scanner.nextLine());
            }
            if (command.equals("QUIT")) {
                break;
            }
        }
    }

    private void show(String name) {
        for (Bird b :
                birds) {
            if (b.getName().equals(name)) {
                System.out.println(b);
            }
        }
    }

    private void observation(String name) {
        for (Bird b :
                birds) {
            if (b.getName().equals(name)) {
                int times = b.getObserved();
                times++;
                b.setObserved(times);
            } else {
                System.out.println("Is not a bird");
            }
        }
    }

    private void statistics() {
        for (Bird b :
                birds) {
            System.out.println(b);
        }
    }

    public void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();
        this.birds.add(new Bird(name, latinName));
    }
}
