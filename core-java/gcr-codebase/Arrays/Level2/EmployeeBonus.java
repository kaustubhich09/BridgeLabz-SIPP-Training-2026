import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            double salary = sc.nextDouble();
            int years = sc.nextInt();

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;

            totalBonus += bonus;
            totalOld += salary;
            totalNew += salary + bonus;
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }
}