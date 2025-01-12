import java.util.*;

public class TraingularPark {
    double RoundOfPark(double perimeter)//method to calculate number of rounds
    {
        //perimeter of park is 3*side
        return 5000/perimeter;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of park in meters: ");
        double side = input.nextInt();
        double perimeter = 3 * side;

        TraingularPark round = new TraingularPark();//creating object of class
        double result = round.RoundOfPark(perimeter);//calling method
        // Display the result
        System.out.println("The Number of rounds will be: " + (int)result );


        
    }
}