import java.util.Scanner;
public class FindFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();//Read the input value
        int maxFactor = 10;
        //Create an array to store the factors
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
           //Check if the number is a factor
            if (number % i == 0) {
                factors[index] = i;
                index++;
                //Store the factor in the array
                if (index == maxFactor) {
                    maxFactor *= 2;
                    //Increase the size of the array
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        //Copy the elements to the new array
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
            }
        }
        System.out.println("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}