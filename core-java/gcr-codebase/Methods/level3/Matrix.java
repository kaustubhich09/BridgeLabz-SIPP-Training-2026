public class MatrixOperations {

    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1]
             - matrix[0][1] * matrix[1][0];
    }

    public static double determinant3x3(double[][] matrix) {

        return matrix[0][0] *
                (matrix[1][1] * matrix[2][2]
                - matrix[1][2] * matrix[2][1])

             - matrix[0][1] *
                (matrix[1][0] * matrix[2][2]
                - matrix[1][2] * matrix[2][0])

             + matrix[0][2] *
                (matrix[1][0] * matrix[2][1]
                - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(double[][] matrix) {

        double det = determinant2x2(matrix);

        if (det == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;

        return inverse;
    }

    public static double[][] inverse3x3(double[][] matrix) {

        double det = determinant3x3(matrix);

        if (det == 0) {
            return null;
        }

        double[][] inverse = new double[3][3];

        inverse[0][0] = ((matrix[1][1] * matrix[2][2]) -
                        (matrix[1][2] * matrix[2][1])) / det;

        inverse[0][1] = ((matrix[0][2] * matrix[2][1]) -
                        (matrix[0][1] * matrix[2][2])) / det;

        inverse[0][2] = ((matrix[0][1] * matrix[1][2]) -
                        (matrix[0][2] * matrix[1][1])) / det;

        inverse[1][0] = ((matrix[1][2] * matrix[2][0]) -
                        (matrix[1][0] * matrix[2][2])) / det;

        inverse[1][1] = ((matrix[0][0] * matrix[2][2]) -
                        (matrix[0][2] * matrix[2][0])) / det;

        inverse[1][2] = ((matrix[0][2] * matrix[1][0]) -
                        (matrix[0][0] * matrix[1][2])) / det;

        inverse[2][0] = ((matrix[1][0] * matrix[2][1]) -
                        (matrix[1][1] * matrix[2][0])) / det;

        inverse[2][1] = ((matrix[0][1] * matrix[2][0]) -
                        (matrix[0][0] * matrix[2][1])) / det;

        inverse[2][2] = ((matrix[0][0] * matrix[1][1]) -
                        (matrix[0][1] * matrix[1][0])) / det;

        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {

        if (matrix == null) {
            System.out.println("Inverse does not exist.");
            return;
        }

        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        double[][] matrix3 = createRandomMatrix(3, 3);

        System.out.println("Original 3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix3));

        System.out.println("\nDeterminant (3x3): "
                + determinant3x3(matrix3));

        System.out.println("\nInverse (3x3):");
        displayMatrix(inverse3x3(matrix3));

        double[][] matrix2 = createRandomMatrix(2, 2);

        System.out.println("\nOriginal 2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("\nDeterminant (2x2): "
                + determinant2x2(matrix2));

        System.out.println("\nInverse (2x2):");
        displayMatrix(inverse2x2(matrix2));
    }
}
