package ca.monor.week08.W8_09_CarRegistrationCentre.cours39_Object;

import java.util.Objects;

public class Book {
    private String name;
    private int publishingYear;

    public Book(String name, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }
        Book compared = (Book) object;
        if (this.publishingYear != compared.getPublishingYear()) {
            return false;
        }
        return this.name != null && this.name.equals(compared.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publishingYear);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.publishingYear + ")";
    }
}