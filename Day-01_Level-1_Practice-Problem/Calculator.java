import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //enter the first number
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        
        //enter the second number
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Print the results
        System.out.println("The Addition, Subtraction, multiplication and division value of two numbers " + number1 + " and " + number2 + " is "
		+addition+", " + subtraction + ", " + multiplication + ", and " + division);
    }
}