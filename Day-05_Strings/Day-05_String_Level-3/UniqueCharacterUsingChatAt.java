import java.util.Scanner;

public class UniqueCharacterUsingChatAt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();
        System.out.println("Length of the text: " + findLength(text));
        char[] uniqueChars = findUniqueCharacters(text);
        System.out.println("Unique characters in the text: ");
        for (char c : uniqueChars) {
            if (c != '\u0000') {
                System.out.print(c + " ");
            }
        }
        }
        public static int findLength(String text) {
            int count = 0;
            try {
                while (true) {
                    text.charAt(count);
                    count++;
                }
            } catch (StringIndexOutOfBoundsException e) {
                return count;
            }
        }
        public static char[] findUniqueCharacters(String text) {
            char[] result = new char[text.length()];
            int j = 0;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (isUniqueCharacter(result, ch)) {
                    result[j] = ch;
                    j++;
                }
            }
            return result;
            }
            public static boolean isUniqueCharacter(char[] result, char ch) {
                for (int i = 0; i < result.length; i++) {
                    if (result[i] == ch) {
                        return false;
                    }
                }
                return true;
            }
}