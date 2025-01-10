 
import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        
        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}