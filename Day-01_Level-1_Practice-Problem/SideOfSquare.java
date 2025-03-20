import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        // Calculate the side length of the square
        double side = perimeter / 4;
        
        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        // Close the scanner
        input.close();
    }
}