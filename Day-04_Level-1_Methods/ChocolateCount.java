import java.util.Scanner;

public class Division {

    // Method to calculate remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Stores remainder and quotient
        result[0] = number % divisor; // Remainder
        result[1] = number / divisor; // Quotient
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter the number: ");
        int number = sc.nextInt(); // Read number

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt(); // Read divisor

        int[] result = findRemainderAndQuotient(number, divisor); // Calculate result

        System.out.println("Remainder: " + result[0]); // Print remainder
        System.out.println("Quotient: " + result[1]); // Print quotient
    }
}