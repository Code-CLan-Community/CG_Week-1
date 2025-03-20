import java.util.Scanner;

public class RemoveSpecificChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to remove: ");
        char ch = sc.next().charAt(0);
        System.out.println("Modified String: " + removeChar(str, ch));
        sc.close();
    }

    public static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}