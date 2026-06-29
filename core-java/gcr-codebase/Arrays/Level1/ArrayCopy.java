import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr2D = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        int[] arr1D = new int[rows * cols];
        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1D[k++] = arr2D[i][j];
            }
        }

        for (int num : arr1D) {
            System.out.print(num + " ");
        }
    }
}