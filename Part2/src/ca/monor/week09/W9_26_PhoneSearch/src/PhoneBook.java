package ca.monor.week09.W9_26_PhoneSearch.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Person> personHashMap;
//    private Map<String, ArrayList<String>> personNumberHashMao;

    public PhoneBook() {
        personHashMap = new HashMap<String, Person>();
//        personNumberHashMao = new HashMap<String, ArrayList<String>>();
    }

    public void addPerson(String name) {
        if (!personHashMap.keySet().contains(name)) {
            personHashMap.put(name, new Person(name));
        }
    }

    public Person getPerson(String name) {
        return this.personHashMap.get(name);
    }

    public void searchForAPersonByPhoneNumber(String number) {
        for (String s :
                personHashMap.keySet()) {
            if (personHashMap.get(s).getPhoneNumber().contains(number)) {
                System.out.println(" " + personHashMap.get(s).getName());
            } else System.out.println(" not found");
        }
    }

    public boolean contains(String name) {
        return personHashMap.containsKey(name);
    }

    public void clear(String name) {
        personHashMap.remove(name);
    }

    public boolean ifContainsKey(String key) {
        for (String s :
                personHashMap.keySet()) {
            if (personHashMap.containsKey(key) || personHashMap.get(s).getName().contains(key)
                    || personHashMap.get(s).getAddress().getCity().contains(key)
                    || personHashMap.get(s).getAddress().getStreet().contains(key)
                    || personHashMap.get(s).getPhoneNumber().contains(key)) {
                return true;
            }
        }
        return false;
    }

    public Set<String> getKeySet() {
        return personHashMap.keySet();
    }

    public void printContainsKey(String key) {
        for (String s :
                personHashMap.keySet()) {
            if (personHashMap.get(s).getAddress().getStreet() == null
                    || personHashMap.get(s).getAddress().getCity() == null) {
                if (personHashMap.containsKey(key)
                        || personHashMap.get(s).getName().contains(key)
                        || personHashMap.get(s).getPhoneNumber().contains(key)) {
                    System.out.println(s);
                    personHashMap.get(s).printAddress();
                    personHashMap.get(s).printNumber();
                }
            } else if (personHashMap.containsKey(key)
                    || personHashMap.get(s).getName().contains(key)
                    || personHashMap.get(s).getAddress().getCity().contains(key)
                    || personHashMap.get(s).getAddress().getStreet().contains(key)
                    || personHashMap.get(s).getPhoneNumber().contains(key)) {
                System.out.println(s);
                personHashMap.get(s).printAddress();
                personHashMap.get(s).printNumber();
            } else {
                System.out.println(" keyword not found");
            }
        }
    }
}
