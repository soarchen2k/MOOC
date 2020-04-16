package ca.monor.week09.W9_24_MultipleEntryDictionary.cours.ManyValuesAndOneKey;

import java.util.HashSet;
import java.util.Set;

/**
 * 48.2 Sets
 *
 * HashSet中的对象会自动排序，并且不能有重复的对象
 */
public class Sets {
    public static void main(String[] args) {
        ExerciseAccounting exerciseAccounting = new ExerciseAccounting();
        exerciseAccounting.add(1);
        exerciseAccounting.add(2);
        exerciseAccounting.add(5);
        exerciseAccounting.add(3);
        exerciseAccounting.add(1);
        exerciseAccounting.addName("Lily");
        exerciseAccounting.addName("Alice");
        exerciseAccounting.printName();
        exerciseAccounting.print();
    }
}

class ExerciseAccounting {
    private Set<Integer> doneExercises;
    private Set<String> names;

    public ExerciseAccounting() {
        this.doneExercises = new HashSet<>();
        this.names = new HashSet<>();
    }

    public void add(int exercises) {
        this.doneExercises.add(exercises);
    }

    public void addName(String string) {
        this.names.add(string);
    }

    public void print() {
        for (int i :
                this.doneExercises) {
            System.out.println(i);
        }
    }

    public void printName() {
        for (String n :
                this.names) {
            System.out.println(n);
        }
    }
}