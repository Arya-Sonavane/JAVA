import java.util.Scanner;
public class MaxBetTwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a:");
		int a=sc.nextInt();
		System.out.println("Enter value for b:");
		int b=sc.nextInt();
		
		String result= a>b ? "a is  maximum number" : "b is maximum number";
		
		System.out.println("Result is : "+result);
		
	}
}