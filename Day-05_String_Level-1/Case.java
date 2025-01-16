
import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input using the  Scanner nextLine() method to take the complete text into a String variable
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        // Call the user-defined method and the String built-in toLowerCase() method, compare the 2 strings, and finally display the result
        System.out.println("User-defined method: " + convertToUpperCase(text));
        System.out.println("Built-in method: " + text.toUpperCase());
        System.out.println(compareStrings(convertToUpperCase(text), text.toUpperCase()));
        sc.close();
    }

    // Write a method to compare two strings using the charAt() method and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
 
    public static String convertToUpperCase(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result[i] = (char) (c - 32);
            } else {
                result[i] = c;
            }
        }
        return new String(result);
    }
}