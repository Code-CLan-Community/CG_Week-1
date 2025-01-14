import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read kilometers input
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert to miles
        double miles = kilometers * 0.621371;

        // Display miles
        System.out.println("Distance in miles: " + miles);
    }
}