// Write a program to find the frequency of characters in a string using charAt() method and display the result
// Hint => 
// Create a method to find the frequency of characters in a string using charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
// Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
// Loop through the text to find the frequency of characters in the text
// Create an array to store the characters and their frequencies
// Loop through the characters in the text and store the characters and their frequencies
// In the main function take user inputs, call user-defined methods, and displays result.  

import java.util.Scanner;
public class FequencyCharUsingCharAt
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        sc.close();
        int[][] frequency = findFrequency(text);
        displayFrequency(frequency);
    }

    public static int[][] findFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        int[][] result = new int[256][2];
        int j = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                result[j][0] = i;
                result[j][1] = frequency[i];
                j++;
            }
        }
        return result;
    }

    public static void displayFrequency(int[][] frequency) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][0] != 0) {
                System.out.println((char) frequency[i][0] + "\t\t" + frequency[i][1]);
            }
        }
    }
}