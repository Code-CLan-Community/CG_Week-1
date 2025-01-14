import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int math = sc.nextInt();

        // Calculate average percentage
        int avg = (phy + chem + math) / 3;

        // Determine grade and remarks
        String grade, remarks;
        if (avg >= 80) {
            grade = "A"; remarks = "Level 4, above agency-normalized standards";
        } else if (avg >= 70) {
            grade = "B"; remarks = "Level 3, at agency-normalized standards";
        } else if (avg >= 60) {
            grade = "C"; remarks = "Level 2, below, but approaching standards";
        } else if (avg >= 50) {
            grade = "D"; remarks = "Level 1, well below standards";
        } else if (avg >= 40) {
            grade = "E"; remarks = "Level 1-, too below standards";
        } else {
            grade = "R"; remarks = "Remedial standards";
        }

        // Output results
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
