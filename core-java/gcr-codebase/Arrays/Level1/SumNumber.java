import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0;
        int i = 0;

        while (i < 10) {
            arr[i] = sc.nextDouble();

            if (arr[i] <= 0)
                break;

            sum += arr[i];
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }

        System.out.println("Sum = " + sum);
    }
}