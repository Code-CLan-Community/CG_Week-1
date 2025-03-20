import java.util.Scanner;

public class FibSequenceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence: ");
        int numberOfTerms = scanner.nextInt();
        scanner.close();
        // Generate the Fibonacci sequence
        generateFibonacciSequence(numberOfTerms);
    }

    // Function to generate the Fibonacci sequence
    public static void generateFibonacciSequence(int n) {
        int[] fibSequence = new int[n];
        fibSequence[0] = 0;
        fibSequence[1] = 1;
        for (int i = 2; i < n; i++) {
            // Generate the Fibonacci sequence
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }
        // Print the Fibonacci sequence
        System.out.println("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibSequence[i] + " ");
        }
    }

}