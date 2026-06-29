import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal Weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        double[][] personData = new double[10][3];
        String[] bmiStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();

            // Calculate BMI
            personData[i][2] = calculateBMI(
                    personData[i][0],
                    personData[i][1]);

            // Store BMI Status
            bmiStatus[i] = getBMIStatus(personData[i][2]);

            System.out.println();
        }

        System.out.println("\nBMI REPORT");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-12s%n",
                "Person", "Weight", "Height", "BMI Status");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f BMI=%.2f (%s)%n",
                    (i + 1),
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    bmiStatus[i]);
        }

        sc.close();
    }
}