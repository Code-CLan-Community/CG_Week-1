import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // enter the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();
        
        // Convert the weight from pounds to kilograms using the conversion factor
        double weightInKg = weightInPounds / 2.2;
        
        // Print the result showing the weight in kilograms
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);
    }
}