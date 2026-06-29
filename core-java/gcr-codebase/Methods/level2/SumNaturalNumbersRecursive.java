import java.util.Scanner;

public class SumNaturalNumbersRecursive {

    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {

            int recursionResult = recursiveSum(n);
            int formulaResult = formulaSum(n);

            System.out.println("Sum using Recursion = " + recursionResult);
            System.out.println("Sum using Formula = " + formulaResult);

            if (recursionResult == formulaResult) {
                System.out.println("Both computations are correct and give the same result.");
            } else {
                System.out.println("The results do not match.");
            }
        }

        sc.close();
    }
}
