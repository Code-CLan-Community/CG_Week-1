public class ExtendUnitConvertor {

    // Conversion factors
    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    // Convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    // Main method for testing
    public static void main(String[] args) {
        double yards = 5.0;
        double feet = 15.0;
        double meters = 2.0;
        double inches = 78.7402;

        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is " + convertInchesToCm(inches) + " centimeters.");
    }
}