// Write a program to check if two texts are anagrams and display the result
// Hint => 
// Anagram is a word or phrase formed by rearranging the same letters to form different words or phrase,
// Write a method to check if two texts are anagrams. The logic used here is as follows:
// Check if the lengths of the two texts are equal
// Create an array to store the frequency of characters in the strings for the two text
// Find the frequency of characters in the two texts using the loop
// Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
// In the main function take user inputs, call user-defined methods, and displays result.  

import java.util.Scanner;

public class CheckAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String text2 = scanner.nextLine();
        boolean result = checkAnagram(text1, text2);
        if (result) {
            System.out.println("The texts are anagrams");
        } else {
            System.out.println("The texts are not anagrams");
            scanner.close();
        }
    }

    public static boolean checkAnagram(String text1, String text2) {
        // Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }
        // Create an array to store the frequency of characters in the strings for the
        // two text
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];
        // Find the frequency of characters in the two texts using the loop
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }
        // Compare the frequency of characters in the two texts
        for (int i = 0; i < frequency1.length; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }
}