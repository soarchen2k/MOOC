package monor.week05.exercise090_TeamAndPlayers;

public class Main {
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
        brian.goals();

        System.out.println("Total goals: " + barcelona.goals());
    }
}
