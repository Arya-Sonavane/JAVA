import java.util.Scanner;
public class ValidTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for a");
		int a=sc.nextInt();
		System.out.println("enter value for b");
		int b=sc.nextInt();
		System.out.println("enter value for c");
		int c=sc.nextInt();
	
		String result = (a+b>c) && (a+c>b) && (b+c>a) ? "It is valid triangle" :"It is Invalid triangle";
		System.out.println(result);
		
	}
}