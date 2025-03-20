import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Convert the temperature from Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9/5) + 32;
        
        // Print the result showing the temperature in Fahrenheit
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

    }
}