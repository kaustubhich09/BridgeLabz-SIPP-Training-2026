import java.util.Scanner;
public class CheckerNumber {
   
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);

        if (temp == 0)
            return 1;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = Math.abs(number);

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

   
    public static void displayArray(int[] arr) {
        for (int digit : arr) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.println("\nCount of Digits: " + countDigits(number));

        System.out.print("Digits Array: ");
        displayArray(digits);

        int[] reversed = reverseArray(digits);

        System.out.print("Reversed Array: ");
        displayArray(reversed);

        System.out.println("Arrays Equal: " +
                compareArrays(digits, reversed));

        if (isPalindrome(digits)) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is not a Palindrome Number.");
        }

        if (isDuckNumber(digits)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        sc.close();
    }
}

