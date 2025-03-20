public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3]; // Array to store sine, cosine, and tangent

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        result[0] = Math.sin(radians); // Sine
        result[1] = Math.cos(radians); // Cosine
        result[2] = Math.tan(radians); // Tangent

        return result; // Return the array with results
    }

    public static void main(String[] args) {
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Example angle in degrees
        double angle = 45.0;

        // Calculate trigonometric functions
        double[] trigValues = calculator.calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }
}