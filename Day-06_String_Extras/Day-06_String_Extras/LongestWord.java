// 5. Find the Longest Word in a Sentence
// Problem:
// Write a Java program that takes a sentence as input and returns the longest word in the
// sentence.

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped over the lazy dog";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in the sentence is: " + longestWord);
    }
}
