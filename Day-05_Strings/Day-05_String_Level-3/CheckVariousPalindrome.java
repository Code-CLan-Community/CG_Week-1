import java.util.Scanner;

public class CheckVariousPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();
        System.out.println("Is the text a palindrome? " + isPalindrome(text));
        System.out.println("Is the text a palindrome? " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Is the text a palindrome? " + isPalindromeUsingCharArray(text));
    }

    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingCharArray(String text) {
        char[] charArray = text.toCharArray();
        char[] reverseArray = reverseCharArray(charArray);
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseCharArray(char[] charArray) {
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return charArray;

    }
}
