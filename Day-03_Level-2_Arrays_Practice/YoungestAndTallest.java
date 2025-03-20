import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        int youngest = 0;//initialize the youngest friend
        int tallest = 0;//initialize the tallest friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of friend " + (i + 1) + ": ");
            age[i] = scanner.nextInt();
            System.out.println("Enter the height of friend " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;//update the youngest friend
            }
            if (height[i] > height[(int) tallest]) {
                tallest = i;//update the tallest friend
            }
        }
        System.out.println("The youngest friend is " + (youngest + 1) + 
        " The tallest friend is " + (tallest + 1));//print the youngest and tallest friend
    }
}
