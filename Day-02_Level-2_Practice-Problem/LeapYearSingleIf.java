import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if year is valid
        if (year >= 1582) {
            // Check for leap year with a single if statement
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Please enter a year >= 1582.");
        }

        scanner.close();
    }
}