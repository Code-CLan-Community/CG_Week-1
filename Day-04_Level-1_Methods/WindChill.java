import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temperature, double windSpeed) {
        if (temperature < 50 && windSpeed > 3) {
            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
            return windChill;
            }
        else {  
            return temperature;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.println("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill is: " + windChill);
        double result = Math.round(windChill);
        System.out.println("The wind chill is: " + result);
        
    }
}
