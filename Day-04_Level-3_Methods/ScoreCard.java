import java.util.Random;
import java.util.Scanner;

public class ScoreCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = generateMarks(numStudents);
        double[][] results = calculateResults(marks, numStudents);
        String[] grades = assignGrades(results, numStudents);

        displayScoreCard(marks, results, grades, numStudents);

        scanner.close();
    }

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateMarks(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics (50-100)
            scores[i][1] = 50 + random.nextInt(51); // Chemistry (50-100)
            scores[i][2] = 50 + random.nextInt(51); // Math (50-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks, int numStudents) {
        double[][] results = new double[numStudents][3]; // [Total, Average, Percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to assign grades based on percentage
    public static String[] assignGrades(double[][] results, int numStudents) {
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; // Remedial standards
            }
        }
        return grades;
    }

    // Method to display the scorecard in tabular format
    public static void displayScoreCard(int[][] marks, double[][] results, String[] grades, int numStudents) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }

        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
