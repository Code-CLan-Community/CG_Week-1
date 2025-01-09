import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // enter the salary
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();
        
        // enter the bonus
        System.out.print("Enter the bonus: ");
        double bonus = input.nextDouble();
        
        // Calculate the total income by adding salary and bonus
        double totalIncome = salary + bonus;
        
        // Print the result showing the total income
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        
        // Close the scanner
        input.close();
    }
}