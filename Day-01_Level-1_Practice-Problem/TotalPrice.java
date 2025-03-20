import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        //enter the unit price of the item
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();
        
        //enter the quantity to be bought
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();
        
        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;
        
        // Print the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        
    }
}