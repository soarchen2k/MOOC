package ca.monor.week07.W7_02_CharacterStringChanger;

import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes = new ArrayList<Change>();

    public Changer() {
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String word) {
        for (Change change : changes) {
            word = change.change(word);
        }
        return word;
    }
}
