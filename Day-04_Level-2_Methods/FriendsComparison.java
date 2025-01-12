import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest friend
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Names of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for ages and heights
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter " + friends[i] + "'s age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter " + friends[i] + "'s height (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display the results
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + 
                           " with an age of " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + 
                           " with a height of " + heights[tallestIndex] + " cm.");

        scanner.close();
    }
}