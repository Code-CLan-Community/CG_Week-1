import java.util.*;

public class MaxOfThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();
        // int max = Math.max(num1, Math.max(num2, num3));
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
        scanner.close();    
    }
        public static int findMax(int num1, int num2, int num3) {
            int max = num1;
            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }
            return max;
            }

}
