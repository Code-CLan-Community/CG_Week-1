// Write a program to find the frequency of characters in a string using nested loops and display the result
// Hint => 
// Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
// Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
// Loops to Find the frequency of each character in the text and store the result in an frequency array. For this use Nested Loop with Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
// Create an 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 

import java.util.Scanner;
public class FrequencyOfCharUsingNestedLoop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        sc.close();
        int[] frequency = findFrequency(text);
        displayFrequency(frequency);
    }

    public static int[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }
        return frequency;
    }

    public static void displayFrequency(int[] frequency) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != '0') {
                System.out.println((char) frequency[i] + "\t\t" + frequency[i]);
            }
        }
    }
}