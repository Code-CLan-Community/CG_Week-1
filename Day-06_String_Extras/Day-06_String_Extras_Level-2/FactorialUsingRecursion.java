import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);
        // Display the result
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    // Function to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            // Recursive call to calculate factorial
            return number * calculateFactorial(number - 1);
        }
    }
}