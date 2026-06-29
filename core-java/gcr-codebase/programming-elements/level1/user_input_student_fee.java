import java.util.Scanner;
public class user_input_student_fee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the course fee: ");
        double courseFee = sc.nextDouble();

        System.out.print("Enter the discount percentage (e.g., 10 for 10%): ");
        double discountPercentage = sc.nextDouble();

        double discountAmount = courseFee * (discountPercentage / 100);
        double finalFee = courseFee - discountAmount;

        System.out.println("Final course fee after " + discountPercentage + "% discount: " + finalFee);

        sc.close();
    }
}
