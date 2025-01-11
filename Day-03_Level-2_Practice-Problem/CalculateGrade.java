import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create arrays to store the marks of students in physics, chemistry, and maths
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        // Create arrays to store the percentage and grade of students
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            physics[i] = sc.nextInt();
            chemistry[i] = sc.nextInt();
            maths[i] = sc.nextInt();
            // Check if the marks are negative
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Marks cannot be negative");
                i--;
            } 
            // Check if the marks are greater than 100
            else if (physics[i] > 100 || chemistry[i] > 100 || maths[i] > 100) {
                System.out.println("Marks cannot be greater than 100");
                i--;
            }
			
            else {
                percentage[i] = ((physics[i] + chemistry[i] + maths[i]) / 3);
                // If the percentage is greater than or equal to 80, the grade is 'A'
                if (percentage[i] >= 80) {
                    grade[i] = 'A';
                }
                // If the percentage is between 70 and 80, the grade is 'B' 
                else if (percentage[i] >= 70 && percentage[i] < 80) {
                    grade[i] = 'B';
                } 
                // If the percentage is between 60 and 70, the grade is 'C'
                else if (percentage[i] >= 60 && percentage[i] < 70) {
                    grade[i] = 'C';
                } 
                // If the percentage is between 50 and 60, the grade is 'D'
                else if (percentage[i] >= 50 && percentage[i] < 60) {
                    grade[i] = 'D';
                }
                // If the percentage is between 40 and 50, the grade is 'E' 
                else if (percentage[i] >= 40 && percentage[i] < 50) {
                    grade[i] = 'E';
                }
				// If the percentage is less than 40, the grade is 'R'	
				else {
                    grade[i] = 'R';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Marks: " + physics[i] + " " + chemistry[i] + " " + maths[i]
                    + " Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}
