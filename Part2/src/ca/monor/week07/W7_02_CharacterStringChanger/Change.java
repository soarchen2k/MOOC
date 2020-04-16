package ca.monor.week07.W7_02_CharacterStringChanger;

public class Change {
    private char a;
    private char b;

    public Change(char a, char b) {
        this.a = a;
        this.b = b;
    }

    public char getA() {
        return a;
    }

    public char getB() {
        return b;
    }

    public String change(String word) {
        return word.replace(this.a, this.b);
    }
}
