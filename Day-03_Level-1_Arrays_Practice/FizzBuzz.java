import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Read the input number
        if (number <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }
        // Create an array to store the FizzBuzz values
        String[] fizzBuzz = new String[number + 1];
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            // Check if the number is divisible by both 3 and 5
            {
                fizzBuzz[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzz[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzz[i] = "Buzz";
            } else {
                fizzBuzz[i] = String.valueOf(i);
            }
        }
        // Print the FizzBuzz values
        for (int i = 0; i < fizzBuzz.length; i++) {
            System.out.println("Position " + i + " = " + fizzBuzz[i]);
        }
    }
}