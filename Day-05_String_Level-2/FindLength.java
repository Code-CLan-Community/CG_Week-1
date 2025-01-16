import java.util.*;

public class FindLength {
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("Length of the string using built-in length() method: " + str.length());
        System.out.println("Length of the string without using built-in length() method: " 
        + findLength(str));
       
    }
}
