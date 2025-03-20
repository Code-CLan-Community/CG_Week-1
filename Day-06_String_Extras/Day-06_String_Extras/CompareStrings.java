import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
                return;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
            }
            scanner.close();
        }
    }
}
