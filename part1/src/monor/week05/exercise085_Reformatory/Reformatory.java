package monor.week05.exercise085_Reformatory;

public class Reformatory extends Person {
    private int totalWeightsMeasured;

    public int weight(Person person) {
        totalWeightsMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return totalWeightsMeasured;
    }
}
