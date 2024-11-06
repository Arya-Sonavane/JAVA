import java.util.Scanner;
	
public class MaxBetThree
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter value for a:");
		int a =sc.nextInt();
		System.out.println("Enter value for b:");
		int b=sc.nextInt();
		System.out.println("Ebter value for c:");
		int c =sc.nextInt();
		
		String result= a>b && a>c ? "a is maximum number" :( b>a && b>c ? "b is maximum number" : " c is maximum number");
	
		System.out.println(result);

	}
}