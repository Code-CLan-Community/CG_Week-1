import java.util.Scanner;
public class CheckNumber {

    int checkNumber(int number)//method to check number
    {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a count of Numbers you want to check: ");
        int count = sc.nextInt();//input count of numbers
        // Get input values for numbers
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        CheckNumber checkNumber = new CheckNumber();
        // Display the result
        for (int i = 0; i < count; i++) {
            System.out.println(checkNumber.checkNumber(numbers[i]));
        }

}
}