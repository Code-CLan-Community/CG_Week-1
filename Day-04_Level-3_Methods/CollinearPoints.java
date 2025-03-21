import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for three points
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        
        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        System.out.print("Enter x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        
        // Check collinearity using slope formula
        boolean collinearSlope = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        
        // Check collinearity using area formula
        boolean collinearArea = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        
        if (collinearSlope && collinearArea) {
            System.out.println("The three points are collinear.");
        } else {
            System.out.println("The three points are NOT collinear.");
        }
        
        scanner.close();
    }
    
    // Method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }
    
    // Method to check collinearity using area formula
    public static boolean isCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
}
