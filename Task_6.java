import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        //read input from the user
        Scanner scanner = new Scanner(System.in);

        //enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        //enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        //enter the time period in years
        System.out.print("Enter the time period in years: ");
        double time = scanner.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the simple interest
        System.out.println("Simple Interest is: " + simpleInterest);

    }
}