import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        // Creating Scanner object to take input 
        Scanner sc = new Scanner(System.in);
        
        // Taking Input of First Number
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        // Taking Input of Second Number
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        // Addding first and Second Number and Storing to a variable
        int num3 = num1 + num2;

        //prints the final output
        System.out.println("Sum of the two numbers is: " + num3);


    }
}
