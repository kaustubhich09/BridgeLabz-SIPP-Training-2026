import java.util.Scanner;

public class StudentGradings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 60)
                grade[i] = 'B';
            else if (percentage[i] >= 40)
                grade[i] = 'C';
            else
                grade[i] = 'F';
        }

        System.out.println("\nPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(percentage[i] + "\t\t" + grade[i]);
        }

        sc.close();
    }
}