import java.util.Scanner;

public class GCDAndLcm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        // Calculate the GCD of the two numbers
        int gcd = calculateGCD(num1, num2);
        // Calculate the LCM of the two numbers
        int lcm = calculateLCM(num1, num2);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateGCD(num2, num1 % num2);
    }

    // Function to calculate the LCM of two numbers
    public static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateGCD(num1, num2);
    }
}