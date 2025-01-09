import java.util.Scanner;

public class UserInFeet {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Convert feet to yards and yards to miles
        double feetToYards = 3.0;
        double yardsToMiles = 1760.0;
        
        // Convert distance to yards
        double distanceInYards = distanceInFeet / feetToYards;
        
        // Convert distance to miles
        double distanceInMiles = distanceInYards / yardsToMiles;
        
        // Print the result
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        
        // Close the scanner
        input.close();
    }
}