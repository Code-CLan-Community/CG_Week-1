// 6. Find Substring Occurrences
// Problem:
// Write a Java program to count how many times a given substring occurs in a string.

import java.util.Scanner;

public class SubstringOccurences {
    public static int countSubstring(String str, String subStr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(subStr)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        System.out.println("Enter the substring ");
        String subStr = sc.nextLine();
        System.out.println("The number of times the substring occurs in the string is: " + countSubstring(str, subStr));
        sc.close();
    }
}