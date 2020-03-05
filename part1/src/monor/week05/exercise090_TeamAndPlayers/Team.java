package monor.week05.exercise090_TeamAndPlayers;

import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player member) {
        this.players.add(member);
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        if (this.maxSize == 0) {
            return players.size();
        } else {
            return Math.min(players.size(), this.maxSize);
        }
    }

    public int goals() {
        int goals = 0;
        for (Player p :
                players) {
            goals += p.getGoals();
        }
        return goals;
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
