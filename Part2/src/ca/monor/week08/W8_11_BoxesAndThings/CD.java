package ca.monor.week08.W8_11_BoxesAndThings;

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private final double weight = .1;

    public CD() {
    }

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return artist + " : " + title + " (" + publishingYear + ")";
    }
}
