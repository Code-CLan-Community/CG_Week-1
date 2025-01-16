import java.util.*;

public class VowelsAndConsonantsDisplayCount {
    public static String checkVowelOrConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] findVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if (checkVowelOrConsonant(str.charAt(i)).equals("Vowel")) {
                vowels++;
            } else if (checkVowelOrConsonant(str.charAt(i)).equals("Consonant")) {
                consonants++;
            }
        }
        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        int[] vowelsAndConsonants = findVowelsAndConsonants(str);
        System.out.println("Vowels: " + vowelsAndConsonants[0]);
        System.out.println("Consonants: " + vowelsAndConsonants[1]);
    }
}