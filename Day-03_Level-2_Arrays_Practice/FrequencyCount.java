import java.util.Scanner;
public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        // create an array to store the frequency of each digit
        int[] freq = new int[10];
        while(num > 0){
            int digit = num % 10;
            // increment the frequency of the digit
            freq[digit]++;
            num = num / 10;
        }
        for(int i = 0; i < 10; i++){
            // print the frequency of each digit
            System.out.println("Frequency of " + i + " is " + freq[i]);
        }
        }
    }
