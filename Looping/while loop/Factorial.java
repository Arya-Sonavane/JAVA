import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		int fact=1 , i=1;
		while(i<=no)
		{
		   fact=fact*i;
		   i++;
		}
		System.out.printf("factorial of number is %d",fact);
	}
}