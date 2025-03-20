import java.util.*;
public class BasicCalculator {
    // Function that adds two numbers
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    // Function that Subtracts two numbers
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    // Function that multiplication two numbers
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    // Function that adds two numbers
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error, can't Divide by Zero!");
            return 0.0;
        } else {
            return num1 / num2;
        }
    }
    // public static void main(String[] vrs) {
        Scanner vr = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = vr.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = vr.nextInt();
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        // Get the user's choice
        int choice = vr.nextInt();
        vr.close();
        double result = 0.0;
        switch (choice) {
            //Call the Addition function
            case 1:
                result = addition(num1, num2);
                System.out.println("Addition: " + result);
                break;
            // Call the subtraction function
            case 2:
                result = subtraction(num1, num2);
                System.out.println("Subtraction: " + result);
                break;
            // Call the multiplication function
            case 3:
                result = multiplication(num1, num2);
                System.out.println("Multiplication: " + result);
                break;
            // Call the division function
            case 4:
                result = division(num1, num2);
                System.out.println("Division: " + result);
                break;
            default:
                System.out.println("Invaild Choice!");
        }
    }
}
