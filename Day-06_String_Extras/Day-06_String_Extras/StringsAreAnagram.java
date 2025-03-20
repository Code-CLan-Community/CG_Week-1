import java.util.Scanner;

public class StringsAreAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        System.out.println("The two strings are anagrams: " + areAnagrams(str1, str2));
    }
        public static boolean areAnagrams(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }
            int[] count = new int[256];
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
                }
                for (int i = 0; i < 256; i++) {
                    if (count[i] != 0) {
                        return false;
                    }
                }
                return true;
                }
}