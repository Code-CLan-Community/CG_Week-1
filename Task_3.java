import java.util.*;
public class Task_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Taking input of temperature in celsius
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        //Converting Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Prints the temperature in Fahrenheit
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        
    }
}
