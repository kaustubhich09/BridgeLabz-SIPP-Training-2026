import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> list = attendance.get(subject);

        if (!list.contains(student)) {
            list.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate attendance not allowed.");
        }
    }

    static void displayAttendance() {

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject : " + subject);

            ArrayList<String> list = attendance.get(subject);

            for (String student : list)
                System.out.println(student);

            System.out.println("Total Students : " + list.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Rahul");
        markAttendance("Java", "Aman");
        markAttendance("Java", "Rahul");

        markAttendance("DBMS", "Priya");
        markAttendance("DBMS", "Rahul");

        displayAttendance();
    }
}