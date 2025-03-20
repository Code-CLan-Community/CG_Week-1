//Creating a class ProfitAndLoss for calculating profit and loss percentage  respectively.
public class ProfitAndLoss {
    public static void main(String[] args) {
        // Define the cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;
        
        // Calculate the profit 
        int profit = sellingPrice - costPrice;
        
        // Calculate the profit percentage
        double profitPercentage = (profit / (double) costPrice) * 100;
        
        // Print the result in a single print statement
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}