import java.util.Scanner;
public class Multi6To9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        //Read the input value
        int[] multiplicationResult = new int[4];
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i -6] = number * i;
            //Store the multiplication result in the array
        }
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}