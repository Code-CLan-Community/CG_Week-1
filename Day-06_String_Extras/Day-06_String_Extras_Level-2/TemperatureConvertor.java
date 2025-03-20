import java.util.Scanner;

public class TemperatureConvertor {

    public static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
        System.out.println("Enter the temperature in Celsius: ");
        float celsius = sc.nextFloat();
        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
        sc.close();
    }
}