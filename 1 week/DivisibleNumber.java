import java.util.Scanner;

public class DivisibleNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for a:");
		int a=sc.nextInt();


		String result= a%5==0 && a%11==0 ? "This number is divisible by 5 and 11" : "This number is not divisible by 5 and 11";
		System.out.println(result);
		
	}
}