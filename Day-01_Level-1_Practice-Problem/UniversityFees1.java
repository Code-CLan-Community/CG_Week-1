import java.util.Scanner;

public class UniversityFees1 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //the user to enter the fee
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();
        
        //the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;
        
        // Calculate the final discounted fee
        double discountedFee = fee - discount;
        
        // Print the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
        
    }
}