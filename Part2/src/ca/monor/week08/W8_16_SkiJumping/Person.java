package ca.monor.week08.W8_16_SkiJumping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Person implements Comparable<Person>{

    private String name;
    private int point;
    private int length;
    private Random random = new Random();
    private List<Integer> lengths = new ArrayList<Integer>();
    private List<Integer> judges = new ArrayList<Integer>();

    public Person(String name) {
        this.name = name;
    }

    public void jump() {
        this.length = random.nextInt(61) + 60;
        lengths.add(this.length);
    }

    public void judge() {
        List<Integer> votes = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            votes.add(random.nextInt(11) + 10);
        }
        Collections.sort(votes);
        this.judges = votes;
    }


    @Override
    public String toString() {
        return name + " (" + point + " points)";
    }

    @Override
    public int compareTo(Person o) {
        return this.point - o.point;
    }


    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getPoint() {
        return point;
    }

    public void printJudgeVotes() {
        System.out.print("    judge votes: [");
        for (int i = 0; i < judges.size(); i++) {
            int a = judges.get(i);
            if (i < judges.size() - 1) {
                System.out.print(a + ", ");
            } else System.out.print(a + "]");
        }
        System.out.println();
    }

    public void setPoints() {
        int judgePoints = 0;
        for (int i = 1; i < judges.size() - 1; i++) {
            judgePoints += judges.get(i);
        }
        this.point += judgePoints + this.length;
    }

    public void printLengths() {
        for (int i = 0; i < lengths.size(); i++) {
            int a = lengths.get(i);
            if (i < lengths.size() - 1) {
                System.out.print(a + " m, ");
            } else System.out.print(a + " m");
        }
    }
}
