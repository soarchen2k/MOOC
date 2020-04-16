package ca.monor.week08.W8_09_CarRegistrationCentre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegister {
    private Map<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate o :
                owners.keySet()) {
            System.out.println(o);
        }
    }

    public void printOwners() {
        ArrayList<String> owner = new ArrayList<String>();
        for (String o :
                owners.values()) {

            if (!owner.contains(o)) {
                owner.add(o);
            }
        }
        for (String o : owner
        ) {
            System.out.println(o);
        }
    }

    public String get(RegistrationPlate plate) {
        if (owners.get(plate) == null) {
            return null;
        }
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (!(owners.get(plate) == null)) {
            owners.remove(plate);
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "owners=" + owners;
    }
}
