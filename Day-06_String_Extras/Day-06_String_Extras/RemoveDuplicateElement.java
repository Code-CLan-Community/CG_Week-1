// 4. Remove Duplicates from a String
// Problem:
// Write a Java program to remove all duplicate characters from a given string and return
// the modified string.

import java.util.Scanner;

public class RemoveDuplicateElement {
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
       String str = sc.nextLine();
        System.out.println("The string after removing duplicates is: " + removeDuplicates(str));
        sc.close();
        }
    }
