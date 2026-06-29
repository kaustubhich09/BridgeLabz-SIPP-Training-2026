import java.util.Scanner;

public class IllegalArgumentExceptionDemo {


    public static void generateException(String text) {

        int startIndex = 5;
        int endIndex = 2;

        String sub = text.substring(startIndex, endIndex);

        System.out.println(sub);
    }

   
    public static void handleException(String text) {

        int startIndex = 5;
        int endIndex = 2;

        try {
            String sub = text.substring(startIndex, endIndex);
            System.out.println("Substring: " + sub);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

       
        handleException(text);

        sc.close();
    }
}