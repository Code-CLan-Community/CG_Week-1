public class VolumeOfEarth {
    public static void main(String[] args) {
        // Define the radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Converting from cubic kilometers to cubic miles
        double InMiles = 0.621371;
        
        // Calculate the volume of Earth in cubic kilometers
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Calculate the volume of Earth in cubic miles
        double volumeMiles = volumeKm * Math.pow(InMiles, 3);
        
        // Print the result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm + " and in cubic miles is " + volumeMiles);
    }
}