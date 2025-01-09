import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // enter the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        //enter the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        
        // Calculate the number of chocolates each child gets by performing integer division
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        
        // Calculate the remaining chocolates that cannot be equally distributed among the children
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Print the result showing the number of chocolates each child gets and the number of remaining chocolates
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
    }
}