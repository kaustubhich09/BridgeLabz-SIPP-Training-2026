import java.util.Scanner;

public class ShortestBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter Weight (kg) & Height (m) for Person " + i + ": ");
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            
            double bmi = w / (h * h);
            
            // Single line to decide status using ternary operators
            String status = (bmi <= 18.4) ? "Underweight" : 
                            (bmi <= 24.9) ? "Normal" : 
                            (bmi <= 39.9) ? "Overweight" : "Obese";

            System.out.printf("Person %d -> BMI: %.1f (%s)\n", i, bmi, status);
        }
        sc.close();
    }
}