import java.util.Scanner;

public class StringDemo {

    public static void generateException(String text) {

        char ch = text.charAt(text.length());

        System.out.println("Character: " + ch);
    }

    public static void handleException(String text) {

        try {
            char ch = text.charAt(text.length());

            System.out.println("Character: " + ch);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
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
