package ca.monor.week07.W7_08_Airport;

import java.util.HashMap;
import java.util.Scanner;

public class Airport {
    private HashMap<String, Airplane> airplaneHashMap = new HashMap<String, Airplane>();
    private HashMap<String, Flight> flightHashMap = new HashMap<String, Flight>();
    private Scanner scanner = new Scanner(System.in);

    public void panel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        PanelMenu();
    }

    public void PanelMenu() {
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            } else {
                System.out.println("Unknown command");
                System.out.println();
            }
        }
    }

    public void addFlight() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        if (airPlaneExist(id)) {
            System.out.print("Give departure airport code: ");
            String dep = scanner.nextLine();
            System.out.print("Give destination airport code: ");
            String dest = scanner.nextLine();
            flightHashMap.put(id, new Flight(airplaneHashMap.get(id), dep, dest));
        } else {
            System.out.println("Air plane does not exist");
        }
    }

    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        if (!airPlaneExist(id)) {
            System.out.print("Give plane capacity: ");
            int capacity = Integer.parseInt(scanner.nextLine());
            airplaneHashMap.put(id, new Airplane(id, capacity));
        } else {
            System.out.print("Air plane already exists");
        }
    }

    public boolean airPlaneExist(String id) {
        return this.airplaneHashMap.containsKey(id);
    }

    public void flightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        flightServiceMenu();
    }

    public void flightServiceMenu() {
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print(">");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printPlaneInfo();
            }
        }
    }

    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        if (airPlaneExist(id)) {
            System.out.println(airplaneHashMap.get(id));
        } else System.out.println("Air plane does not exist");
    }

    public void printFlights() {
        for (Flight a :
                flightHashMap.values()) {
            System.out.println(a);
        }
    }

    public void printPlanes() {
        for (Airplane a :
                airplaneHashMap.values()) {
            System.out.println(a);
        }
    }
}