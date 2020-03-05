package ca.monor.week08.W8_16_SkiJumping;

import java.util.Comparator;

public class ReversPersons implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getPoint()-o1.getPoint();
    }
}
