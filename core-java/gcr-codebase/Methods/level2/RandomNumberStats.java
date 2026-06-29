import java.util.Arrays;

public class RandomNumberStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;

            min = (int) Math.min(min, num);
            max = (int) Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated Random Numbers:");
        System.out.println(Arrays.toString(randomNumbers));

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + (int)result[1]);
        System.out.println("Maximum = " + (int)result[2]);
    }
}
