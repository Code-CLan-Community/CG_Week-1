import java.util.Scanner;
public class BmiStatus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        
        String[] status = new String[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Enter the weight of person " + (i+1) + ": ");
            //Reads the weight of the person
            weight[i] = sc.nextDouble();
            System.out.println("Enter the height of person " + (i+1) + ": ");
            //Reads the height of the person
            height[i] = sc.nextDouble();
            //Calculates the BMI of the person
            bmi[i] = weight[i] / (height[i] * height[i]);

            //Logic to determine the status of the person
            if(bmi[i] < 18.5){
                status[i] = "Underweight";
            }else if(bmi[i] >= 18.5 && bmi[i] < 25){
                status[i] = "Normal weight";
            }else if(bmi[i] >= 25 && bmi[i] < 30){
                status[i] = "Overweight";
            }else{
                status[i] = "Obese";
            }
        }       
} 
}