import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //enter the length of side1 of the triangle in meters
        System.out.print("Enter side1 of the triangle in meters: ");
        double side1 = input.nextDouble();
        
        //enter the length of side2 of the triangle in meters
        System.out.print("Enter side2 of the triangle in meters: ");
        double side2 = input.nextDouble();
        
        //enter the length of side3 of the triangle in meters
        System.out.print("Enter side3 of the triangle in meters: ");
        double side3 = input.nextDouble();
        
        // Calculate the perimeter of the triangle by adding the lengths of all sides
        double perimeter = side1 + side2 + side3;
        
        // Calculate the number of rounds the athlete needs to complete a 5 km run
        double rounds = 5000 / perimeter;
        
        // Print the result showing the total number of rounds the athlete will run
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        
    }
}