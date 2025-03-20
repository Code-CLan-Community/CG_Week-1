import java.util.*;

public class DisplayCharacterType {
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

    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkVowelOrConsonant(str.charAt(i));
        }
        return result;
    }

    public static void displayCharacterType(String[][] result) {
        System.out.println("Character\tType");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        String[][] vowelsAndConsonants = findVowelsAndConsonants(str);
        displayCharacterType(vowelsAndConsonants);
    }
}