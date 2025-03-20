import java.util.Scanner;
public class FrequencyCharUsingUniqueChar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();
        char[] uniqueChars = findUniqueCharacters(text);
        int[][] frequency = findFrequency(text, uniqueChars);
        displayFrequency(frequency);
    }
    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (isUniqueCharacter(uniqueChars, ch)) {
                uniqueChars[j] = ch;
                j++;
            }
        }
        return uniqueChars;
    }
    public static boolean isUniqueCharacter(char[] uniqueChars, char ch) {
        for (int i = 0; i < uniqueChars.length; i++) {
            if (uniqueChars[i] == ch) {
                return false;
            }
        }
        return true;
    }
    public static int[][] findFrequency(String text, char[] uniqueChars) {
        int[][] frequency = new int[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            frequency[i][0] = uniqueChars[i];
            frequency[i][1] = 0;
        }
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < uniqueChars.length; j++) {
                if (text.charAt(i) == uniqueChars[j]) {
                    frequency[j][1]++;
                }
            }
        }
        return frequency;
    }
    public static void displayFrequency(int[][] frequency) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][0] != 0) {
                System.out.println((char) frequency[i][0] + "\t\t" + frequency[i][1]);
            }
        }
    }
}
