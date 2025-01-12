import java.util.*;

public class LeapYear {

    // Method to check if a given year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false; // Leap year rule applies only from 1582 onwards
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // Leap year logic
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: "); // Prompt user for input
        int year = scanner.nextInt(); // Read the year input

        // Check if the year is a leap year and display the result
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close(); // Close the scanner
    }
}