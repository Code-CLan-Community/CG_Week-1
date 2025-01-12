import java.util.Scanner;
public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();//Read the input value
        int [] multiplicationTable = new int[10];
        for (int i = 1; i <= 10; i++)
        {
            multiplicationTable[i-1] = number * i;
            //Store the multiplication result in the array
        }
        for (int i = 0; i < 10; i++)
        {   //Print the multiplication table
            System.out.println(number + " * " + (i+1) + " = " + multiplicationTable[i]);
        }
    }
}