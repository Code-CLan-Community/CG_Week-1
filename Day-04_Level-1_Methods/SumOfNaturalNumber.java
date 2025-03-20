import java.util.Scanner;
public class SumOfNaturalNumber {
    int sumOfNaturalNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();//taking input from user
        int sum = 0;//initializing sum to 0
        for(int i = 1; i <= n; i++){
            sum += i;// adding i to sum
        }
        return sum;//returning sum
    }
    public static void main(String[] args) {
        SumOfNaturalNumber obj = new SumOfNaturalNumber();
        //calling sumOfNaturalNumber method
        System.out.println("Sum of natural number is: " + obj.sumOfNaturalNumber());
    }
}
