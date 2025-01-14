import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum and originalNumber
        int sum = 0;
        int originalNumber = number;

        // Check if the number is Armstrong
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; // Find remainder
            sum += Math.pow(remainder, 3); // Add cube of remainder to sum
            originalNumber /= 10; // Remove last digit
        }

        // Display result
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close scanner
        scanner.close();
    }
}