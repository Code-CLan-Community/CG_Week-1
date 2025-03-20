import java.util.Scanner;

public class SumOfNaturalNumbersComparison {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number
        if (number >= 0) {
            // Calculate the sum using the formula
            int sumFormula = number * (number + 1) / 2;
            
            // Calculate the sum using a while loop
            int sumLoop = 0;
            int i = 1;
            while (i <= number) {
                sumLoop += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula + ", Sum using loop: " + sumLoop);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}