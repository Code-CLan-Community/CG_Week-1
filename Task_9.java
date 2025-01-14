import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Read second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Read third number
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Display average
        System.out.println("Average is: " + average);
    }
}