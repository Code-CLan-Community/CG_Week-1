import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //enter the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        // enter the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        // Calculate the quotient using the division operator
        int quotient = number1 / number2;
        
        // Calculate the remainder using the modulus operator
        int remainder = number1 % number2;
        
        // Print the result showing the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);

    }
}