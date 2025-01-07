import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read base input
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Read exponent input
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate power
        double result = Math.pow(base, exponent);

        // Display result
        System.out.println("Result: " + result);
    }
}