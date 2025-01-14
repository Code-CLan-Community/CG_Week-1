import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        // Compute Euclidean Distance
        double distance = computeEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);
        
        // Compute equation of the line
        double[] equation = findEquationOfLine(x1, y1, x2, y2);
        System.out.printf("Equation of the Line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        
        scanner.close();
    }

    public static double computeEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findEquationOfLine(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // Slope
        double b = y1 - (m * x1); // Y-intercept
        return new double[]{m, b};
    }
}
