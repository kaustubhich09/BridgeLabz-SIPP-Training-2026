import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largest = 0, second = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }

            n /= 10;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}