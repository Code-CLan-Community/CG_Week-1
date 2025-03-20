import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum
        int sum = 0;
        int originalNumber = number;

        // Calculate sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10; // Add digit to sum
            originalNumber /= 10; // Remove last digit
        }

        // Check if Harshad number
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        // Close scanner
        scanner.close();
    }
}