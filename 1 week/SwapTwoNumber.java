import java.util.Scanner;
public class SwapTwoNumber
{
	public static void main(String args[])
	{	
		int a , b , c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for a:");
		a=sc.nextInt();
		System.out.println("enter value for b:");
		b=sc.nextInt();
		
		System.out.println(" a :"+a +" b :"+ b);
		c=a+b;
		a=c-a;
		b=c-b;
	
		System.out.println(" a :"+a +" b :"+ b);
	}
}