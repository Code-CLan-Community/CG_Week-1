import java.util.Scanner;

public class AreaOfTheTraingle{
	 
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //enter the base of the triangle in centimeters
        System.out.print("Enter the base of the triangle in centimeters: ");
        double baseCm = input.nextDouble();
        
        //enter the height of the triangle in centimeters
        System.out.print("Enter the height of the triangle in centimeters: ");
        double heightCm = input.nextDouble();
        
        // Convert square centimeters to square inches
        double cmToInches = 2.54;
        
        // Calculate the area of the triangle in square centimeters
        double areaCm = 0.5 * baseCm * heightCm;
        
        // Calculate the area of the triangle in square inches
        double areaInches = areaCm / (cmToInches * cmToInches);
        
        // Print the result
        System.out.println("The area of the triangle is " + areaCm + " square centimeters and " + areaInches + " square inches.");
      
    }
}