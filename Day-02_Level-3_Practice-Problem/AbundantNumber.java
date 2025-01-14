import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum
        int sum = 0;

        // Calculate sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if Abundant number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        // Close scanner
        scanner.close();
    }
}