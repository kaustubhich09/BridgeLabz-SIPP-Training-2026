import java.util.*;

public class SpaceMissionCrewManagementSystem {

    // Mission -> List of Astronauts
    static HashMap<String, List<Astronaut>> missions = new HashMap<>();

    // Mission -> Set of Astronaut IDs (to prevent duplicates)
    static HashMap<String, HashSet<String>> assignedIds = new HashMap<>();

    // Add New Mission
    public static void addMission(String missionName) {

        if (!missions.containsKey(missionName)) {
            missions.put(missionName, new ArrayList<>());
            assignedIds.put(missionName, new HashSet<>());

            System.out.println("Mission Added: " + missionName);
        } else {
            System.out.println("Mission already exists.");
        }
    }

    // Assign Astronaut
    public static void assignAstronaut(String missionName, Astronaut astronaut) {

        if (!missions.containsKey(missionName)) {
            System.out.println("Mission not found.");
            return;
        }

        HashSet<String> ids = assignedIds.get(missionName);

        if (ids.contains(astronaut.getAstronautId())) {
            System.out.println("Duplicate Assignment Not Allowed.");
            return;
        }

        missions.get(missionName).add(astronaut);
        ids.add(astronaut.getAstronautId());

        System.out.println(astronaut.getName() +
                " assigned to " + missionName);
    }

    // Display All Missions
    public static void displayMissions() {

        System.out.println("\n===== Mission Details =====");

        for (String mission : missions.keySet()) {

            System.out.println("\nMission : " + mission);

            List<Astronaut> crew = missions.get(mission);

            if (crew.isEmpty()) {
                System.out.println("No astronauts assigned.");
            } else {

                for (Astronaut a : crew) {
                    System.out.println(a);
                }
            }

            System.out.println("Total Astronauts : " + crew.size());
        }
    }

    public static void main(String[] args) {

        addMission("Moon Mission");
        addMission("Mars Mission");

        Astronaut a1 = new Astronaut("A101", "Rahul", "Pilot");
        Astronaut a2 = new Astronaut("A102", "Priya", "Scientist");
        Astronaut a3 = new Astronaut("A103", "Aman", "Engineer");

        assignAstronaut("Moon Mission", a1);
        assignAstronaut("Moon Mission", a2);

        assignAstronaut("Moon Mission", a1); // Duplicate

        assignAstronaut("Mars Mission", a1);
        assignAstronaut("Mars Mission", a3);

        displayMissions();
    }
}