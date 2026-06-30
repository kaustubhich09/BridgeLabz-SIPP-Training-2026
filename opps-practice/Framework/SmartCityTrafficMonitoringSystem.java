import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SmartCityTrafficMonitoringSystem {

    // Road Name -> Vehicle Count
    static HashMap<String, Integer> trafficData = new HashMap<>();

    // Add or Update Vehicle Count
    public static void addOrUpdateRoad(String roadName, int vehicleCount) {

        if (trafficData.containsKey(roadName)) {

            int updatedCount = trafficData.get(roadName) + vehicleCount;
            trafficData.put(roadName, updatedCount);

            System.out.println("Updated " + roadName +
                    " Vehicle Count: " + updatedCount);

        } else {

            trafficData.put(roadName, vehicleCount);

            System.out.println("Added Road: " + roadName +
                    " Vehicle Count: " + vehicleCount);
        }
    }

    // Display Roads in Sorted Order
    public static void displaySortedRoads() {

        TreeMap<String, Integer> sortedRoads = new TreeMap<>(trafficData);

        System.out.println("\n===== Roads in Sorted Order =====");

        for (Map.Entry<String, Integer> entry : sortedRoads.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue() + " Vehicles");
        }
    }

    // Find Busiest Road
    public static void findBusiestRoad() {

        String busiestRoad = "";
        int maxVehicles = 0;

        for (Map.Entry<String, Integer> entry : trafficData.entrySet()) {

            if (entry.getValue() > maxVehicles) {
                maxVehicles = entry.getValue();
                busiestRoad = entry.getKey();
            }
        }

        System.out.println("\n===== Busiest Road =====");
        System.out.println("Road Name : " + busiestRoad);
        System.out.println("Vehicle Count : " + maxVehicles);
    }

    // Generate Traffic Report
    public static void generateReport() {

        System.out.println("\n===== Traffic Analysis Report =====");

        for (Map.Entry<String, Integer> entry : trafficData.entrySet()) {

            String status;

            if (entry.getValue() >= 1000) {
                status = "Heavy Traffic";
            } else if (entry.getValue() >= 500) {
                status = "Moderate Traffic";
            } else {
                status = "Low Traffic";
            }

            System.out.println(entry.getKey() +
                    " --> " +
                    entry.getValue() +
                    " Vehicles (" + status + ")");
        }

        System.out.println("\nTotal Roads Monitored: " + trafficData.size());
    }

    public static void main(String[] args) {

        addOrUpdateRoad("MG Road", 750);
        addOrUpdateRoad("Ring Road", 1200);
        addOrUpdateRoad("Airport Road", 450);
        addOrUpdateRoad("Station Road", 900);

        // Update Existing Road
        addOrUpdateRoad("MG Road", 300);

        displaySortedRoads();

        findBusiestRoad();

        generateReport();
    }
}