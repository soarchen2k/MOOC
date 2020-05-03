package ca.monor.week09.W9_26_PhoneSearch.src2.phoneSearch;

public class Address {
    private String street;
    private String city;

    public Address() {    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

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
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public boolean addressContainsKeyword(String keyword) {
        return this.street.contains(keyword) || this.city.contains(keyword);
    }
}
