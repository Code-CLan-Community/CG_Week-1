

import java.util.*;

public class SplitTheArray {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitTheArray(String str) {
        int count = 0;
        int[] spaces = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces[count] = i;
                count++;
            }
        }
        String[] words = new String[count + 1];
        words[0] = str.substring(0, spaces[0]);
        for (int i = 1; i < count; i++) {
            words[i] = str.substring(spaces[i - 1] + 1, spaces[i]);
        }
        words[count] = str.substring(spaces[count - 1] + 1);
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
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
        String[] words = splitTheArray(str);
        String[] words2 = str.split(" ");
        System.out.println("Words using splitTheArray method: " + Arrays.toString(words));
        System.out.println("Words using split() method: " + Arrays.toString(words2));
        System.out.println("Are the two arrays equal? " + compareArrays(words, words2));
    }
}