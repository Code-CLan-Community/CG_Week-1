import java.util.*;

public class ReverseNumber
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int var = num;//copy of num
		int count = 0;//count the number of digits
		while(var>0)
		{
			var/=10;
			count++;
		}	
		int[] reverse = new int [count];//array to store the reverse of the number
		
		for(int i =0; i<count;i++)
		{
			//store the last digit of the number in the array
			reverse[i]= num%10;
			num/=10;
			//print the reverse of the number
			System.out.print(reverse[i]);
		}
		
	}
	
}