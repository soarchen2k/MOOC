package ca.monor.week09.W9_26_PhoneSearch.src;

public class PersonAddress {
    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return street + " " + city;
    }

    public boolean isEmpty() {
        return this.city == null && this.street == null;
    }
}
