package ca.monor.week08.W8_16_SkiJumping.others;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Points {

    private int length;
    private List<Integer> votes;
    private Random random;

    public Points() {
        this.random = new Random();
        this.length = random.nextInt(61) + 60;
        this.votes = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            this.votes.add(this.random.nextInt(11) + 10);
        }
    }

    public int getLength() {
        return this.length;
    }

    public String printVotes() {
        String votes = "[";
        for (int i = 0; i < 4; i++) {
            votes += this.votes.get(i) + ", ";
        }
        votes += this.votes.get(4) + "]";
        return votes;
    }

    public int getValidVotes() {
        Collections.sort(this.votes);
        int totalValidVotes = 0;
        for (int i = 1; i < 4; i++) {
            totalValidVotes += this.votes.get(i);
        }
        return totalValidVotes;
    }

    public int getPoints() {
        return this.length + this.getValidVotes();
    }

    @Override
    public String toString() {
        String results = "    length: " + this.length + "\n" + "    judge votes: " + this.printVotes();
        return results;
    }
}