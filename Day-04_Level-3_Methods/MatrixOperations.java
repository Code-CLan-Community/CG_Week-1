import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix with the given number of rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        // Fill the matrix with random integers between 0 and 9
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        // Perform element-wise addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        // Perform element-wise subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        // Swap rows with columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to display a matrix in a readable format
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " "); // Print each element in the row
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the dimensions of the matrices from the user
        System.out.println("Enter the number of rows for the matrices:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for the matrices:");
        int cols = scanner.nextInt();

        // Create two random matrices with the given dimensions
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        // Display the generated matrices
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Perform and display the result of matrix addition
        System.out.println("\nAddition of Matrices:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Perform and display the result of matrix subtraction
        System.out.println("\nSubtraction of Matrices:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Perform and display the result of matrix multiplication (if dimensions are compatible)
        if (matrixA[0].length == matrixB.length) {
            System.out.println("\nMultiplication of Matrices:");
            displayMatrix(multiplyMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nMultiplication not possible due to incompatible dimensions.");
        }

        // Display the transpose of the first matrix
        System.out.println("\nTranspose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        scanner.close(); // Close the scanner to release resources
    }
}
