import java.util.Scanner;

public class ReplaceGiverWord {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                     
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to replace: ");
        String wordToReplace = sc.next();
        System.out.println("Enter the new word: ");
        String newWord = sc.next();
        System.out.println("Modified Sentence: " + replaceWord(sentence, wordToReplace, newWord));
        sc.close();
    }

    public static String replaceWord(String sentence, String wordToReplace, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.equals(wordToReplace)) {
                sb.append(newWord).append(" ");
            } else {
                sb.append(word).append(" ");
            }
        }
        return sb.toString().trim();
    }    
}
