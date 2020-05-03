package ca.monor.week09.W9_26_PhoneSearch.src;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<String> phoneNumber;
    private PersonAddress address;

    public Person() {
        phoneNumber = new ArrayList<String>();
        address = new PersonAddress();
    }

    public Person(String name) {
        phoneNumber = new ArrayList<String>();
        address = new PersonAddress();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber.add(number);
    }

    public PersonAddress getAddress() {
        return address;
    }

    public void setAddress(PersonAddress address) {
        this.address = address;
    }

    public void printNumber() {
        if (phoneNumber.isEmpty()) {
            System.out.println("  phone number not found");
        } else {
            for (String number :
                    phoneNumber) {
                System.out.println(" " + number);
            }
        }
    }

    public void printAddress() {
        if (address.isEmpty()) {
            System.out.println("  address unknown");
        }else
        System.out.println("  address: " + this.address.toString());
    }
}
