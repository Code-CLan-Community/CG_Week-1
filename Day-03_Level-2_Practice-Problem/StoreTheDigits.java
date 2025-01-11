import java.util.Scanner;
public class StoreTheDigits
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int maxDigit = 10;//maximum number of digits
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            int digit = number % 10;//extract the last digit
            digits[index] = digit;//store the digit in the array
            number /= 10;//remove the last digit
            index++;//increment the index
            if (index == maxDigit) {//if the index is equal to the maximum number of digits
                break;
            }
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest to be the previous largest
                largest = digits[i]; // Update largest to be the current digit
            } else if (digits[i] > secondLargest) { // If the current digit is greater than the second largest
                secondLargest = digits[i]; // Update second largest to be the current digit
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
