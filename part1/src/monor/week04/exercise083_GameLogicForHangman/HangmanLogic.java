package monor.week04.exercise083_GameLogicForHangman;

public class HangmanLogic {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!this.word.contains(letter) && !this.guessedLetters.contains(letter)) {
            this.numberOfFaults++;
        }
        if (!this.guessedLetters.contains(letter)) {
            this.guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        String hiddenWord = this.word;
        int i = 0;
        while (i < word.length()) {
            if (!this.guessedLetters.contains(""+this.word.charAt(i))) {
                hiddenWord = hiddenWord.replace(""+this.word.charAt(i), "_");
            }
            i++;
        }
        return hiddenWord;
    }
}
