import java.util.*;

public class HeightOfPalayer {
    public static double meanOfPlayers(int[] players) {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += players[i];
        }
        return (double) sum / 11;
    }

    public static int shortestHeight(int[] players) {
        int min = players[0];
        for (int i = 0; i < 11; i++) {
            if (players[i] < min) {
                min = players[i];
            }
        }
        return min;
    }

    public static int tallestHeight(int[] players) {
        int max = players[0];
        for (int i = 0; i < 11; i++) {
            if (players[i] > max) {
                max = players[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] players = new int[11];

        for (int i = 0; i < 11; ++i) {
            System.out.println("Enter the Height of Player " + i+1 + " in range of 150 cms to 250cms: ");
            players[i] = sc.nextInt();
            while (players[i] < 150 || players[i] > 250) {
                System.out.println("Invalid Input. Please enter the height in range of 150 cms to 250cms " );
                players[i] = sc.nextInt();
                }

        }
        double mean = meanOfPlayers(players);
        System.out.println("Mean height of players: " + mean);
        sc.close();
    }

}