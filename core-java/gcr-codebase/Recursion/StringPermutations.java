import java.util.Scanner;

public class StringPermutations {

    public static void permute(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String remaining = str.substring(0, i) + str.substring(i + 1);

            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("Permutations are:");
        permute(str, "");

        sc.close();
    }
}