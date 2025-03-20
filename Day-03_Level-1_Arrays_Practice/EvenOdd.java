import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[5];
        System.out.print("Enter five numbers seperated by space : ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is a positive even number.");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last numbers are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First number is greater than the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }
}
