import java.util.Scanner;
public class MeanHeight
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11]; 
        // Create an array to store the heights of the players
        double sum = 0.0;
        // Create a variable to store the sum of the heights
        for (int i = 0; i < 11; i++)
        {
            System.out.print("Enter the height of player " + (i + 1) + ": ");
          // enter the height of the player
            heights[i] = sc.nextDouble();
            sum += heights[i];// add the height to the sum
            
        }
        double mean = sum / 11;
        System.out.println("Mean height of the football team: " + mean);
    }
    }   
