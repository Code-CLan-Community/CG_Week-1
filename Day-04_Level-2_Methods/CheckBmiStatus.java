import java.util.Scanner;

public class CheckBmiStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and determine status
        for (int i = 0; i < 10; i++) {
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            statuses[i] = determineStatus(data[i][2]);
        }

        // Display the results
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + data[i][0] + " kg, Height = " + data[i][1] + " cm, BMI = " + data[i][2] + ", Status = " + statuses[i]);
        }

        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}