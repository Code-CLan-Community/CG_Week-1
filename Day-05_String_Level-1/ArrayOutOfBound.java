
import java.util.Scanner;
public class ArrayOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input using the Scanner next() method for 2 String variables
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name: ");
            names[i] = sc.next();
        }
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println(generateException(names, index));
        sc.close();
    }

    // Write a method to generate an ArrayIndexOutOfBoundsException
    public static String generateException(String[] names, int index) {
        try {
            return names[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "ArrayIndexOutOfBoundsException caught";
        } catch (Exception e) {
            return "Generic Exception caught";
        }
    }
}