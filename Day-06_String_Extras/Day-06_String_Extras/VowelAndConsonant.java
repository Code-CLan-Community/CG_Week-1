// 1. Count Vowels and Consonants
// Problem:
// Write a Java program to count the number of vowels and consonants in a given string.

import java.util.*;

public class VowelAndConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vCount = 0, cCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                cCount++;
            }
        }
        System.out.println("Number of Vowels: " + vCount);
        System.out.println("Number of Consonants: " + cCount);
        sc.close();
}
}