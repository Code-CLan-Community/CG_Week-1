import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //enter the principal amount
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        
        //enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        
        // enter the time period
        System.out.print("Enter the time: ");
        double time = input.nextDouble();
        
        // Calculate the simple interest using the formula
        double simpleInterest = (principal * rate * time) / 100;
        
        // Print the result showing the simple interest
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    
    }
}