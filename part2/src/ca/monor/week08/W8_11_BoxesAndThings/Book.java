package ca.monor.week08.W8_11_BoxesAndThings;

public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book() {
    }

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return writer + " : " + name;
    }
}
