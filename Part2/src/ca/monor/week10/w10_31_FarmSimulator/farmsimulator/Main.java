package ca.monor.week10.w10_31_FarmSimulator.farmsimulator;

import ca.monor.week10.w10_31_FarmSimulator.farmsimulator.farm.BulkTank;
import ca.monor.week10.w10_31_FarmSimulator.farmsimulator.farm.Cow;

public class Main {
    public static void main(String[] args) {
//        BulkTank tank = new BulkTank();
//        tank.getFromTank(100);
//        tank.addToTank(25);
//        tank.getFromTank(5);
//        System.out.println(tank);
//
//        tank = new BulkTank(50);
//        tank.addToTank(100);
//        System.out.println(tank);
//        tank.getFromTank(30);
//        tank.addToTank(5);
//        System.out.println(tank.howMuchFreeSpace());

//        Cow cow = new Cow();
//        System.out.println(cow);
//        while (cow.getMilkVolume() < cow.getUdderCapacity()) {
//            cow.liveHour();
//            System.out.println(cow);
//        }
//        cow.milk();
//        System.out.println(cow);

        Cow cow = new Cow();
        System.out.println(cow);


        Alive livingCow = cow;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();

        System.out.println(cow);

        Milkable milkingCow = cow;
        milkingCow.milk();

        System.out.println(cow);
        System.out.println(milkingCow);
        System.out.println("");

        cow = new Cow("Ammu");
        System.out.println(cow);
        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);
        cow.milk();
        System.out.println(cow);
        System.out.println(milkingCow);
    }
}
