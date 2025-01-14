import java.util.Scanner;

public class KilometersToMiles1 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        
        // Create a variable to store the distance in kilometers
        double km = input.nextDouble();
        
        // Conversion factor from kilometers to miles
        double conversionFactor = 1.6;
        
        // Calculate the distance in miles
        double miles = km / conversionFactor;
        
        // Print the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        // Close the scanner
        input.close();
    }
}