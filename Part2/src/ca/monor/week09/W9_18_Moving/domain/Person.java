package ca.monor.week09.W9_18_Moving.domain;

public class Person implements Identifiable , Comparable<Identifiable>{
    private String name;
    private String id;

    @Override
    public String getID() {
        return this.getPersonID();
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getPersonID() {
        return this.id;
    }

    @Override
    public String toString(){
        return this.name + " ID: " +this.id;
    }

    @Override
    public int compareTo(Identifiable o) {
        return this.getID().compareTo(o.getID());
    }

//    @Override
//    public int compareTo(Person o) {
//        return this.getID().compareTo(o.getID());
//    }
}

