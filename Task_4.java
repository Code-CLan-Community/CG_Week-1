import java.util.*;
public class Task_4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input of radius
        System.out.println("Enter the Radius: ");
        double radius = sc.nextDouble();
        
        // Calculating Area of Circle
        double area = Math.PI * Math.pow(radius, 2);
        
        //Prints the Area of Circle
        System.out.println("Area of Circle: " + area);
    }
}
