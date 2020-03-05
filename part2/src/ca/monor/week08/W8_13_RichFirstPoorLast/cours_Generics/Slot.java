package ca.monor.week08.W8_13_RichFirstPoorLast.cours_Generics;

public class Slot<T> {
    private T key;

    public T getValue() {
        return key;
    }

    public void setValue(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "" + key;
    }
}
