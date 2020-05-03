package ca.monor.week09.W9_26_PhoneSearch.src2.phoneSearch;

import java.util.HashSet;
import java.util.Set;

public class Phone {
    private Set<String> numbers;

    public Phone() {
        this.numbers = new HashSet<>();
    }

    public void add(String number) {
        numbers.add(number);
    }

    public Set<String> getNumbers() {
        return numbers;
    }
}
