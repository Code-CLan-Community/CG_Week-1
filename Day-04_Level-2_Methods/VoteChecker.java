import java.util.Scanner;

public class VoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        // Validate if age is negative
        if (age < 0) {
            return false; // Cannot vote if age is negative
        }
        // Check if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VoteChecker voteChecker = new VoteChecker();

        // Define an array to store ages of 10 students
        int[] studentAges = new int[10];

        // Loop to take user input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Loop to check and display voting eligibility for each student
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote: " + canVote);
        }

        scanner.close(); // Close the scanner
    }
}