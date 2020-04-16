package ca.monor.week09.W9_24_MultipleEntryDictionary.cours.ManyValuesAndOneKey;

import java.util.*;

public class MapAndSet {
    public static void main(String[] args) {
        ExerciseAccounting2 accounting = new ExerciseAccounting2();
        accounting.add("Mikael", 3);
        accounting.add("Mikael", 4);
        accounting.add("Mikael", 3);
        accounting.add("Mikael", 3);

        accounting.add("Pekka", 4);
        accounting.add("Pekka", 4);

        accounting.add("Matti", 1);
        accounting.add("Matti", 2);

        accounting.print();
    }
}

class ExerciseAccounting2 {
    private Map<String, Set<Integer>> doneExercises;

    public ExerciseAccounting2() {
        this.doneExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        if (!this.doneExercises.containsKey(user)) {
            this.doneExercises.put(user, new HashSet<Integer>());
        }
        this.doneExercises.get(user).add(exercise);
    }

    public void print() {
        for (String name :
                this.doneExercises.keySet()) {
            System.out.println(name + this.doneExercises.get(name));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExerciseAccounting2 that = (ExerciseAccounting2) o;
        return Objects.equals(doneExercises, that.doneExercises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doneExercises);
    }
}