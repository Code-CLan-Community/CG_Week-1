// Define the class AveragePercentage to calculate the AveragePercentage of Sam.
public class AveragePercentage {
    public static void main(String[] args) {
        // Define the marks in each subject
		
        // Sam's mark in Maths is 94 out of 100
        int mathsMark = 94;
        
        // Sam's mark in Physics is 95 out of 100
        int physicsMark = 95;
        
        // Sam's mark in Chemistry is 96 out of 100
        int chemistryMark = 96;
        
        // Calculate the total marks obtained in all three subjects
        int totalMarks = mathsMark + physicsMark + chemistryMark;
        
        // Calculate the average marks by dividing the total marks by the number of subjects
        double averageMarks = totalMarks / 3.0;
        
        // Print the result
        // Output the average mark in PCM
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }
}