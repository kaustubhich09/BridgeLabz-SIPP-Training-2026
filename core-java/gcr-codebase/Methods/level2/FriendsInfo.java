import java.util.Scanner;

public class FriendsInfo {

    public static String findYoungest(int[] ages, String[] names) {
        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }

        return names[minIndex];
    }

    public static String findTallest(double[] heights, String[] names) {
        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }

        return names[maxIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            ages[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i] + " (in cm):");
            heights[i] = sc.nextDouble();
        }

        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("\nYoungest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);

        sc.close();
    }
}