package ca.monor.week10.w10_29_PersonAndTheirHeirs.cours.InheritanceOfClassFeatures;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("combustion engine", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(motor.getMotorType());
        System.out.println(motor.getProducer());
    }
}
