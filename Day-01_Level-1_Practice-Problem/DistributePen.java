public class DistributePen {
    public static void main(String[] args) {
        // Define the total number of pens and the number of students
        int totalPens = 14;
        int numberOfStudents = 3;
        
        // Calculate the number of pens each student will get
        int pensPerStudent = totalPens / numberOfStudents;
        
        // Calculate the remaining non-distributed pens
        int remainingPens = totalPens % numberOfStudents;
        
        // Print the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}