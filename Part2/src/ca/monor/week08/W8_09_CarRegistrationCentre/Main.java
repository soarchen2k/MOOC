package ca.monor.week08.W8_09_CarRegistrationCentre;

public class Main {

    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");
        VehicleRegister owners = new VehicleRegister();
        System.out.println(owners.add(reg1, "Nima"));
        owners.add(reg2, "Mina");
        owners.add(reg3, "Nima");
//        System.out.println(owners);
//        System.out.println(owners.delete(reg2));
//        System.out.println(owners);
        owners.printRegistrationPlates();
        owners.printOwners();
    }
}
