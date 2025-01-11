import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        // Create variables to keep track of the index
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                // If the number is odd
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print the odd numbers array
        System.out.println("Odd numbers: ");
        for (int i = 0; i < odd.length; i++) {
            if (odd[i] != 0) {
                System.out.print(odd[i] + " ");
            }
        }

        // Print the even numbers array
        System.out.println("\nEven numbers: ");
        for (int i = 0; i < even.length; i++) {
            if (even[i] != 0) {
                System.out.print(even[i] + " ");
            }
        }
    }
}