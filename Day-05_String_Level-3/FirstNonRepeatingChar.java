import java.util.Scanner;
public class FirstNonRepeatingChar
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        sc.close();
        System.out.println("First non-repeating character in the text: " + findFirstNonRepeatingChar(text));
    }

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\u0000';
    }
}