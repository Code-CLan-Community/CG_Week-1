import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the value for a
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        
        // Prompt the user to enter the value for b
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        
        // Prompt the user to enter the value for c
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        
        // Perform the integer operations and understand operator precedence
        int result1 = a + b * c; 
		// Multiplication has higher precedence than addition
        int result2 = a * b + c; 
		// Multiplication has higher precedence than addition
        int result3 = c + a / b; 
		// Division has higher precedence than addition
        int result4 = a % b + c; 
		// Modulus has higher precedence than addition
        
        // Print the results of the integer operations
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}