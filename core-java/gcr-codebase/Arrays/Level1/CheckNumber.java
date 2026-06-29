import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (a[i] > 0)
                System.out.println(a[i] % 2 == 0 ? "Positive Even" : "Positive Odd");
            else if (a[i] < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }

        if (a[0] == a[4])
            System.out.println("Equal");
        else if (a[0] > a[4])
            System.out.println("Greater");
        else
            System.out.println("Less");
    }
}