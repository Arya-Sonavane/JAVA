import java.util.Scanner;

public class SwapWithoutThirdVariable
{
	public static void main(String args[])
	{
		int a , b ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for a:");
		a=sc.nextInt();
		System.out.println("enter value for b:");
		b=sc.nextInt();
		
		System.out.println(" a :"+a +" b :"+ b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" a :"+a +" b :"+ b);

	}
}