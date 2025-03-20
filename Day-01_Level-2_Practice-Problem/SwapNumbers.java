import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // enter the first number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        // enter the second number
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        // Swap the values of num1 and num2 using a temporary variable
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        
        // Print the result showing the swapped numbers
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
        
}