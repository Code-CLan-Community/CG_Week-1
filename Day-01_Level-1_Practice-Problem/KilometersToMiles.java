public class KilometersToMiles {
    public static void main(String[] args) {
        // Define the distanceInKm variable to store integer value in kilometers
        double distanceInKm = 10.8;
        
        // Per unit Conversion from kilometers to miles
        double Conversion = 1.6;
        
        // Convert the distance to miles and store in variable distanceInMiles
        double distanceInMiles = distanceInKm / Conversion;
        
        // Print the result
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}