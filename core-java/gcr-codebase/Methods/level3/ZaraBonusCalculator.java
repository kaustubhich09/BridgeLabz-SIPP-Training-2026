public class ZaraBonusCalculator {

    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2];

        for (int i = 0; i < employees; i++) {

            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // Years of service (1 - 10)
            data[i][1] = (int) (Math.random() * 10) + 1;
        }

        return data;
    }

    public static double[][] calculateBonus(int[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][2];

        for (int i = 0; i < n; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; 
            } else {
                bonus = salary * 0.02; 
            }

            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    public static void displayReport(int[][] employeeData,
                                     double[][] salaryData) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("\n---------------------------------------------------------------");
        System.out.printf("%-5s %-12s %-10s %-12s %-12s%n",
                "Emp", "OldSalary", "Years", "Bonus", "NewSalary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {

            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = salaryData[i][0];
            double newSalary = salaryData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-5d %-12d %-10d %-12.2f %-12.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus      : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        int[][] employeeData = generateEmployeeData(employees);

        double[][] salaryData = calculateBonus(employeeData);

        displayReport(employeeData, salaryData);
    }
}
