import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int[] arr = new int[10];
        int size = 10, index = 0;

        while (num > 0) {
            if (index == size) {
                size += 10;
                int[] temp = new int[size];

                for (int i = 0; i < index; i++)
                    temp[i] = arr[i];

                arr = temp;
            }

            arr[index++] = (int)(num % 10);
            num /= 10;
        }

        int largest = 0, second = 0;

        for (int i = 0; i < index; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}