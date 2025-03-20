import java.util.Scanner;

public class FindBMI {
    // Method to compute BMI and return BMI values along with Status
    public static String[][] computeBMI(double[] weight, double[] height) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double heightInMeters = height[i] / 100; // Convert cm to meters
            double bmi = weight[i] / (heightInMeters * heightInMeters);

            result[i][0] = String.format("%.2f", height[i]); // Keeping 2 decimal places
            result[i][1] = String.format("%.2f", weight[i]);
            result[i][2] = String.format("%.2f", bmi);

            // Determine BMI Category
            if (bmi <= 18.4) {
                result[i][3] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                result[i][3] = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                result[i][3] = "Overweight";
            } else {
                result[i][3] = "Obese";
            }
        }

        return result;
    }

    // Method to display BMI result in tabular format
    public static void displayResult(String[][] result) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + result[i][0] + "\t\t" + result[i][1] + "\t\t" + result[i][2] + "\t\t" + result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weights = new double[10];
        double[] heights = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the weight of person " + (i + 1) + " in kg: ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter the height of person " + (i + 1) + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        String[][] result = computeBMI(weights, heights);
        displayResult(result);
        sc.close();
    }
}

