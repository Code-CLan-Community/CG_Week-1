import java.util.Scanner;

public class Division {

    // Method to calculate the remainder and quotient of a division operation
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store the remainder and quotient
        result[0] = number % divisor; // Calculate the remainder using the modulus operator
        result[1] = number / divisor; // Calculate the quotient using the division operator
        return result; // Return the array containing remainder and quotient
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input

        // Prompt the user to enter the number
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); // Read the number from the user

        // Prompt the user to enter the divisor
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt(); // Read the divisor from the user

        // Call the method to calculate remainder and quotient
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the remainder and quotient
        System.out.println("Remainder: " + result[0]); // Print the remainder
        System.out.println("Quotient: " + result[1]); // Print the quotient
    }
}