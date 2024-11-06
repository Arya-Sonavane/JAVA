import java.util.Scanner;
public class SidesOfTriangle
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
	
 		String result= a==b && a==c && b==c ? " It is a Equilateral Triangle" : 
				(a==b && b!=c ? " It is isolateral Triagnle":
				(a!=b && b!=c && a!=c ? "It is Scalene Triangle":"no"));
		
		System.out.println(result);

	}
}