import java.util.Scanner;

public class MaxDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10; // Initial size of the digits array
        int[] digits = new int[maxDigit]; // Array to store digits
        int index = 0; // Index to keep track of the number of digits

        // Loop to extract digits from the number
        while (number > 0) {
            if (index == maxDigit) { // If index equals maxDigit, increase the size of the array
                maxDigit += 10; // Increase maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a new temp array of size maxDigit
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy digits to temp array
                digits = temp; // Assign temp array to digits
            }
            digits[index++] = number % 10; // Store the last digit of the number in the array
            number /= 10; // Remove the last digit from the number
        }

        int largest = Integer.MIN_VALUE; 
        // Initialize largest to the smallest possible integer value
        int secondLargest = Integer.MIN_VALUE; 
        // Initialize second largest to the smallest possible integer value

        // Loop through the digits array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) { 
                // If the current digit is greater than the largest
                secondLargest = largest; 
                // Update second largest to be the previous largest
                largest = digits[i]; 
                // Update largest to be the current digit
            } else if (digits[i] > secondLargest && digits[i] != largest) { 
                secondLargest = digits[i]; 
                // Update second largest to be the current digit
            }
        }

        // Print the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
} 