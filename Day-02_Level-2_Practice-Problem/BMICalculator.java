import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in kilograms
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        // Prompt the user to enter height in centimeters
        System.out.print("Enter height in cm: ");
        double heightInCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula BMI = weight / (height * height)
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determine weight status based on BMI value
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the calculated BMI and weight status
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Weight Status: " + status);

        // Close the scanner
        scanner.close();
    }
}
