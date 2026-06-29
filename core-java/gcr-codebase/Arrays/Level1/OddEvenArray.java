import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] odd = new int[n];
        int[] even = new int[n];

        int o = 0, e = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        for (int i = 0; i < o; i++)
            System.out.print(odd[i] + " ");

        System.out.println();

        for (int i = 0; i < e; i++)
            System.out.print(even[i] + " ");
    }
}