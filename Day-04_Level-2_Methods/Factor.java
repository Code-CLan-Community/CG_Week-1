import java.util.*;

public class Factor {

    // Method to find all factors of a given number
    public static int[] findFactors(int num) {
        int count = 0;
        // Count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        // Populate the array with factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to calculate the sum of all factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        // Iterate through the factors and calculate the sum
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of all factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        // Iterate through the factors and calculate the product
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of all factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        // Iterate through the factors and calculate the sum of squares
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        // Find factors of the input number
        int[] factors = findFactors(num);
        // Display the factors and related calculations
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Sum of Squares of Factors: " + sumOfSquaresOfFactors(factors));
        scanner.close();
    }
}