import java.util.Scanner;
public class ToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        String lowerCaseText = toLowerCase(text);
        String upperCaseText = text.toUpperCase();
        System.out.println("Lower Case Text: " + lowerCaseText);
        System.out.println("Upper Case Text: " + upperCaseText);
        System.out.println("Are both the strings equal? " + compareStrings(lowerCaseText, upperCaseText));
        sc.close();
    }

    public static String toLowerCase(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] = (char) (charArray[i] + 32);
            }
        }
        return new String(charArray);
    }

    public static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
