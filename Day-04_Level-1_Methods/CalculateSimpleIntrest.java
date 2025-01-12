import java.util.Scanner;

public class CalculateSimpleIntrest {
    
    // Method to calculate simple interest
    double SimpleIntrest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input values for principal, rate, and time
        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period: ");
        double time = sc.nextDouble();

        // Create an object of CalculateSimpleIntrest class
        CalculateSimpleIntrest obj = new CalculateSimpleIntrest();

        // Calculate and display simple interest
        double interest = obj.SimpleIntrest(principal, rate, time);
        System.out.println("Simple Interest: " + interest);

        // Close scanner
        sc.close();
    }
}