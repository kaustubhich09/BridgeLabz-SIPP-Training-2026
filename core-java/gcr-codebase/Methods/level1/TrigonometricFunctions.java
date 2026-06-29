import java.util.Scanner;

public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f) = %.4f%n", angle, result[0]);
        System.out.printf("Cosine(%.2f) = %.4f%n", angle, result[1]);
        System.out.printf("Tangent(%.2f) = %.4f%n", angle, result[2]);

        sc.close();
    }
}
