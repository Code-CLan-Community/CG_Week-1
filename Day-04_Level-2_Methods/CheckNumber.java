import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check each number
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even" : "odd"));
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }

        // Compare the first and last elements
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first number is greater than the last number.");
        }
        else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        scanner.close();
    }

    // Method to check if a number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}