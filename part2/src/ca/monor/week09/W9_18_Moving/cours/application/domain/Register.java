package ca.monor.week09.W9_18_Moving.cours.application.domain;

import java.util.*;

public class Register {
    private HashMap<String, Identifiable> registered;

    public Register() {
        this.registered = new HashMap<String, Identifiable>();
    }

    public void add(Identifiable toBeAdded) {
        this.registered.put(toBeAdded.getID(), toBeAdded);
    }

    public Identifiable get(String id) {
        return this.registered.get(id);
    }

    public List<Identifiable> getAll() {
        return new ArrayList<Identifiable>(registered.values());
    }

    public List<Identifiable> sortAndGetEverything() {
        ArrayList<Identifiable> all = new ArrayList<Identifiable>(registered.values());
        Collections.sort(all, new Comparator<Identifiable>() {
            @Override
            public int compare(Identifiable o1, Identifiable o2) {
                return o1.getID().compareTo(o2.getID());
            }
        });
        return all;
    }
}