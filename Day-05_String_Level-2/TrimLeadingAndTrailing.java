import java.util.*;

public class TrimLeadingAndTrailing {
    public static int[] trimLeadingAndTrailingSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;                                                                                                                                                                                                                                                                                                                                                                                                         
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        return new int[] { start, end };
    }

    public static String getSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        int[] startEnd = trimLeadingAndTrailingSpaces(str);
        String trimmedStr = getSubstring(str, startEnd[0], startEnd[1]);
        String trimmedStrBuiltIn = str.trim();
        System.out.println("Trimmed String: " + trimmedStr);
        System.out.println("Trimmed String using built-in method: " + trimmedStrBuiltIn);
        System.out.println("Are the strings equal? " + compareStrings(trimmedStr, trimmedStrBuiltIn));
    }
}