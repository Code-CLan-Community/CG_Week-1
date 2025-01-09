import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // enter name
        System.out.print("Enter your name: ");
        String name = input.next();
        
        //enter from city
        System.out.print("Enter your from city: ");
        String fromCity = input.next();
        
        // enter via city
        System.out.print("Enter your via city: ");
        String viaCity = input.next();
        
        // enter to city
        System.out.print("Enter your to city: ");
        String toCity = input.next();
        
        //enter the distance from to via in miles
        System.out.print("Enter distance from to via in miles: ");
        double fromToVia = input.nextDouble();
        
        //enter the distance via to final city in miles
        System.out.print("Enter distance via to final city in miles: ");
        double viaToFinalCity = input.nextDouble();
        
        //enter the time taken
        System.out.print("Enter time taken: ");
        double timeTaken = input.nextDouble();
        
        // Print the result showing the details entered by the user
        System.out.println("Name: " + name + ", From City: " + fromCity + ", Via City: " + viaCity + ", To City: " + toCity + ", Distance from to via: " + fromToVia + " miles, Distance via to final city: " + viaToFinalCity + " miles, Time taken: " + timeTaken);
		
    }
}