import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize count
        int count = 0;

        // Count digits
        while (number != 0) {
            number /= 10; // Remove last digit
            count++; // Increment count
        }

        // Display count
        System.out.println("Number of digits: " + count);

        // Close scanner
        scanner.close();
    }
}