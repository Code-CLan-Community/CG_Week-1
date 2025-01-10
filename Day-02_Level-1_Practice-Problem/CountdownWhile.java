 
import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        
        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}