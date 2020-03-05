package ca.monor.week07.W7_06_PromissoryNote;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> notes;

    public PromissoryNote() {
        this.notes = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        notes.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (!notes.containsKey(whose)) {
            return 0;
        }
        return notes.get(cleanName(whose));
    }

    public String cleanName(String name) {
        if (name == null) {
            return "";
        }
        return name.trim();
    }
}
