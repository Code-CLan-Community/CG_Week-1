import java.util.Scanner;

public class CmToInchAndFoot {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //enter the height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        
        // Converting in cm to inch and inch to Feet
        double cmToInches = 2.54;
        double inchesToFeet = 12;
        
        // Convert height to inches
        double heightInches = heightCm / cmToInches;
        
        // Convert height to feet and remaining inches
        int heightFeet = (int) (heightInches / inchesToFeet);
        double remainingInches = heightInches % inchesToFeet;
        
        // Print the result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + remainingInches);
        
    }
}