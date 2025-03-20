import java.util.Scanner;
public class NullPoirnterExcep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the first string: ");
        String str1 = scanner.next();
        System.out.println("Enter the second string: ");
        String str2 = null;
        System.out.println(compareStrings(str1, str2));
        scanner.close();
    }
    // Write a method to compare two strings using the charAt() method and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        try {
            if (str1.charAt(0) == str2.charAt(0)) {
                return true;
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
        return false;
    }
}
