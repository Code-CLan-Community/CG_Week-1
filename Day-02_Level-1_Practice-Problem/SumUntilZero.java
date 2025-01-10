 
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        
        // Loop to sum numbers until the user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double value = scanner.nextDouble();
            if (value == 0) {
                break;
            }
            total += value;
        }
        System.out.println("The total sum is " + total);
    }
}