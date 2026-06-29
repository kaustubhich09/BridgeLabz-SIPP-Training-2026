import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    public static String getMonthName(int month) {
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    
    public static int getFirstDay(int month, int year) {

        int m = month;
        int y = year;

        if (m < 3) {
            m += 12;
            y--;
        }

        int q = 1; 
        int k = y % 100;
        int j = y / 100;

        int h = (q + (13 * (m + 1)) / 5 + k +
                (k / 4) + (j / 4) + (5 * j)) % 7;

        return (h + 6) % 7;
    }

   
    public static void displayCalendar(int month, int year) {

        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        System.out.println("\n      " +
                getMonthName(month) + " " + year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= totalDays; day++) {

            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}
