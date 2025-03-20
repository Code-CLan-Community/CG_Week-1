import java.util.*;;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess = 0;
        int low = 1;
        int high = 100;
        int count = 0;
        System.out.println("Think of a number between 1 and 100");
        System.out.println("Press Enter to continue");
        scanner.nextLine();
        while (true) {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is the number " + guess + "?");
            System.out.println("Enter 'h' if the number is higher, 'l' if the number is lower, 'c' if the number is correct");
            String response = scanner.nextLine();
            if (response.equals("h")) {
                low = guess + 1;
            } else if (response.equals("l")) {
                high = guess - 1;
            } else if (response.equals("c")) {
                System.out.println("The number is " + guess);
                break;
            } else {
                System.out.println("Invalid input");
            }
            count++;
            }
        System.out.println("Number of guesses: " + count);
        scanner.close();
        }
}