import java.util.Scanner;

public class Voting{
    public static void main(String[] args) {
        // Create a program that asks the user to enter their age and prints out if they are eligible to vote or not.
        Scanner scanner = new Scanner(System.in);
        int [] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age: ");
            // Read the age from the user
            ages[i] = scanner.nextInt();
        }
        
        if(ages.length > 0) // Check if the array is not empty
        {   
            for (int i = 0; i < ages.length; i++) {
                if(ages[i] >= 18)  // Check if the age is greater than or equal to 18
                {
                    System.out.println("You are eligible to vote.");
                } else // If the age is less than 18 
                {
                    System.out.println("You are not eligible to vote.");
                }
            }
        } else {
            // If the array is empty
            System.out.println("No age is provided.");
        }
    }
}
