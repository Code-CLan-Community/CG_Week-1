import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static boolean isNaturalNumber(int n) {
        return n > 0; // Natural numbers are positive
    }

    public static int sumRecursive(int n) {
        if (n == 1) return 1; // Base case
        return n + sumRecursive(n - 1); // Recursive call
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2; // Formula for sum
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (!isNaturalNumber(n)) {
            System.out.println("Invalid input. Please enter a natural number.");
            System.exit(0); // Exit if invalid
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and match!");
        } else {
            System.out.println("Results do not match. Error in computation.");
        }

        scanner.close(); // Close scanner
    }
}