import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number: ");
        int number = scanner.nextInt();
        scanner.close();
        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);
        if (isPrime) {
            // If the number is prime
            System.out.println(number + " is a prime number.");
        } else {
            // If the number is not prime
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}