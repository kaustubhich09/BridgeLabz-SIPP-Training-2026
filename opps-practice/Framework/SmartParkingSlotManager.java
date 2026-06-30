import java.util.ArrayList;

public class SmartParkingSlotManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    static void vehicleEntry(String number) {
        vehicles.add(number);
        System.out.println(number + " Entered.");
    }

    static void vehicleExit(String number) {

        if (vehicles.remove(number))
            System.out.println(number + " Exited.");
        else
            System.out.println("Vehicle Not Found.");
    }

    static void searchVehicle(String number) {

        if (vehicles.contains(number))
            System.out.println("Vehicle is Parked.");
        else
            System.out.println("Vehicle Not Found.");
    }

    static void displayVehicles() {

        System.out.println("Parked Vehicles:");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots : " + vehicles.size());
    }

    public static void main(String[] args) {

        vehicleEntry("UK06AB1234");
        vehicleEntry("DL01XY9999");
        vehicleEntry("UP32AA4567");

        searchVehicle("DL01XY9999");

        vehicleExit("UK06AB1234");

        displayVehicles();
    }
}