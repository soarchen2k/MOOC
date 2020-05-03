package ca.monor.week10.w10_31_FarmSimulator.farmsimulator.farm;

import ca.monor.week10.w10_31_FarmSimulator.farmsimulator.Alive;
import ca.monor.week10.w10_31_FarmSimulator.farmsimulator.Milkable;

import java.util.Random;

public class Cow implements Milkable, Alive {
    private String name;
    private double udderCapacity;
    private double milkVolume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUdderCapacity() {
        return udderCapacity;
    }

    public void setUdderCapacity(double udderCapacity) {
        this.udderCapacity = udderCapacity;
    }

    public double getMilkVolume() {
        return milkVolume;
    }

    public void setMilkVolume(double milkVolume) {
        this.milkVolume = milkVolume;
    }

    public Cow() {
        this.name = randomName();
        this.udderCapacity = 15 + new Random().nextInt(26);
    }

    private String randomName() {
        String lettersUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lettersLower = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lettersUpper.charAt(new Random().nextInt(26)));
        for (int i = 0; i < new Random().nextInt(6) + 3; i++) {
            stringBuilder.append(lettersLower.charAt(new Random().nextInt(26)));
        }
        return stringBuilder.toString();
    }

    public Cow(String name) {
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
    }

    @Override
    public double milk() {
        this.milkVolume = 0;
        return 0;
    }

    @Override
    public void liveHour() {
        double milk = ((double) new Random().nextInt(14) / 10d) + 0.7;
        this.milkVolume = Math.min(this.milkVolume + milk, udderCapacity);
    }

    @Override
    public String toString() {
        return name + " " + milkVolume + "/" + udderCapacity;
    }
}
