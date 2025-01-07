import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        // Volume of cylinder
        Scanner sc = new Scanner(System.in);

        //input radius
        System.out.println("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        //Input height
        System.out.println("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // calculating volume
        double volume = Math.PI * Math.pow(radius, 2) * height;
       
        // prints volume
        System.out.println("Volume of cylinder: " + volume);

    }
}
