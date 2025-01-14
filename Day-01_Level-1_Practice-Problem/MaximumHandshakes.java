import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate the maximum number of handshakes using the combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Print the result
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);
    }
}