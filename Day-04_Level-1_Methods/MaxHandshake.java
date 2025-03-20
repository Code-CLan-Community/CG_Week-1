import java.util.Scanner;
public class MaxHandshake {
    // Method to calculate maximum number of handshakes
    int maxHandshake(int n) {
        return n * (n - 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get input value for number of people
        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();
        // Create an object of MaxHandshake class
        MaxHandshake obj = new MaxHandshake();
        // Calculate and display maximum number of handshakes
        int maxHandshakes = obj.maxHandshake(n);
        System.out.println("Maximum number of handshakes: " + maxHandshakes);
        // Close scanner
        sc.close();
    }
}
