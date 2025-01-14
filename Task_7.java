import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read length 
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        // Read width
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Display perimeter
        System.out.println("Perimeter of the rectangle is: " + perimeter);

    }
}