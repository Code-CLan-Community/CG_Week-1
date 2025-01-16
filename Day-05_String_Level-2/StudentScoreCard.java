import java.util.*;;

public class StudentScoreCard {
    static final int NUM_STUDENTS = 5; // Number of students

    // Generates random scores (between 50 and 99) for three subjects
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 50 + rand.nextInt(50); // Scores between 50 and 99
            }
        }
        return scores;
    }

    // Calculates total marks, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0; // Rounded to 2 decimal places
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Assigns grades based on percentage
    public static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R"; // Remedial standards
        }
        return grades;
    }

    // Displays the final scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("ID  Physics  Chemistry  Math  Total  Average  Percentage  Grade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-3d %-8d %-9d %-5d %-6.0f %-8.2f %-10.2f %-2s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(NUM_STUDENTS);
        double[][] stats = calculateStats(scores);
        String[] grades = assignGrades(stats);
        displayScoreCard(scores, stats, grades);
    }
}
