import java.util.Scanner;
public class InputValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Create an array of 10 double values
        double[] numbers = new double[10];
        double total = 0.0;
        //Create a variable to keep track of the index
        int index = 0;
        while (true) {
            System.out.print("Enter a number: ");
            //Read the input value
            double number = scanner.nextDouble();
            if (number <= 0 || index == 10) //If the input value is less than or equal to 0, exit the loop
            {
                break;
            }
            //Store the input value in the array
            numbers[index] = number;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        System.out.println("All numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        //Print the total
        System.out.println("\nTotal: " + total);
    }
}