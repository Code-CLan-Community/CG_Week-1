
import java.util.*;

public class SplitArrayIn2D {
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

    public static String[][] splitArrayIn2D(String str) {
        String[] words = splitTheArray(str);
        String[][] wordsAndLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsAndLengths[i][0] = words[i];
            wordsAndLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordsAndLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        String[][] wordsAndLengths = splitArrayIn2D(str);
        System.out.println("Word\tLength");
        for (String[] wordAndLength : wordsAndLengths) {
            System.out.println(wordAndLength[0] + "\t" + Integer.parseInt(wordAndLength[1]));
        }
    }
}