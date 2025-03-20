import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the value for a (double)
        System.out.print("Enter value for a (double): ");
        double da = input.nextDouble();
        
        // Prompt the user to enter the value for b (double)
        System.out.print("Enter value for b (double): ");
        double db = input.nextDouble();
        
        // Prompt the user to enter the value for c (double)
        System.out.print("Enter value for c (double): ");
        double dc = input.nextDouble();
        
        // Perform the double operations and understand operator precedence
        double dresult1 = da + db * dc; 
		// Multiplication has higher precedence than addition
        double dresult2 = da * db + dc; 
		// Multiplication has higher precedence than addition
        double dresult3 = dc + da / db; 
		// Division has higher precedence than addition
        double dresult4 = da % db + dc; 
		// Modulus has higher precedence than addition
        
        // Print the results of the double operations
        System.out.println("The results of Double Operations are " + dresult1 + ", " + dresult2 + ", " + dresult3 + ", and " + dresult4);
        
        // Close the scanner
        input.close();
    }
}