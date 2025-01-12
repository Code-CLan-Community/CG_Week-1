import java.util.Scanner;
public class BmiStatusMulti{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int number = sc.nextInt();

        // Create a 2D array to store the height, weight, and BMI of each person
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Loop to read the height and weight of each person
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the height of person " + (i + 1) + ":");
            double height = sc.nextDouble();
            // Validate the height input
            while (height <= 0) {
                System.out.println("Invalid height. Please enter again.");
                height = sc.nextDouble();
            }
            // Store the height in the 2D array
            personData[i][0] = height;
            System.out.println("Enter the weight of person " + (i + 1) + 
            ": ");
            // Read the weight of the person
            double weight = sc.nextDouble();
            // Validate the weight input
            while (weight <= 0) {
                System.out.println("Invalid weight. Please enter again.");
                weight = sc.nextDouble();
            }
            // Store the weight in the 2D array
            personData[i][1] = weight;
            // Calculate the BMI of the person
            double bmi = weight / (height * height);

            personData[i][2] = bmi;
            
            // Determine the weight status of the person
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
            // Print the height, weight, BMI, and weight status of the person
            System.out.println("Height: " + personData[i][0] + ", Weight: "
            + personData[i][1] + ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
            }
        }
}