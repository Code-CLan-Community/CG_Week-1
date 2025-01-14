// Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
// Hint => 
// All the steps are the same as the problem 8 except the marks are stored in a 2D array
// Use the 2D array to calculate the percentages, and grades of the students

import java.util.Scanner;

public class CalculateGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            percentage[i] = sum / 3;
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
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " percentage is " +
                    percentage[i] + " and grade is " + grade[i]);
        }
    }
}
