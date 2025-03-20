public class UnitConvertor {

    // Conversion factors
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    
    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    // Main method for testing
    public static void main(String[] args) {
        double km = 10.0;
        double miles = 6.21371;
        double meters = 5.0;
        double feet = 16.4042;

        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
    }
}