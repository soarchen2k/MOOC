package monor.week04.exercise083_GameLogicForHangman;

public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("disponible");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
