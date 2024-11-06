 import java.util.Scanner;

public class PositiveNegative
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value for a:");
		int a=sc.nextInt();
		
		
		String result= a>0 ? "number is positive" : ( a==0 ? "number is zero" :  "number is negative");
		System.out.println(result);
	}zero
}