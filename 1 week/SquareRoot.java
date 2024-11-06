import java.util.Scanner;
import java.lang.Math;

public class SquareRoot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Square:");
		int Square=sc.nextInt();
	
		double SR=Math.sqrt(Square);
	
		System.out.println("Square root of number is :"+SR);
		
	}
}