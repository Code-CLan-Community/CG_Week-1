import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        // Find multiples
        for (int i = 100; i > 0; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}