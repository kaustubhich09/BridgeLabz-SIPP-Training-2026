import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][1] = (int) (Math.random() * 90) + 10; 
            scores[i][2] = (int) (Math.random() * 90) + 10; 
            scores[i][0] = (int) (Math.random() * 90) + 10; 
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3];

        for (int i = 0; i < students; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    public static void displayScoreCard(int[][] scores,
                                        double[][] results) {

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "%"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);

        double[][] results = calculateResults(scores);

        displayScoreCard(scores, results);

        sc.close();
    }
}