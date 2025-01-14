import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Convert the temperature from Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5/9;
        
        // Print the result showing the temperature in Celsius
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
 
    }
}