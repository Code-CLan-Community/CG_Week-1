// Creating a class for paying University Fee after Discount.
public class UniversityFees {

    public static void main(String[] args) {
        // Define the fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;
        
        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;
        
        // Calculate the final discounted fee
        double discountedFee = fee - discount;
        
        // Print the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}