import java.util.Scanner;
public class Candies
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of candies available:");
		int N=sc.nextInt();
		System.out.println("enter no of candies inside jar:");
		int k=sc.nextInt();
		
		if(k<=5)
		{
			int s=N-k;
			System.out.println("No of Candies sold: "+k);
			System.out.println("No of Candies available:" +s);
		}
		else
		{
			System.out.println("Invalid Input");
		} 
	}	
}