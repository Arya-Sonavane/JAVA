import java.util.Scanner;
public class TriangleType
{
	public static void main(String args[])
	{
	 	int a , b, c;
		Scanner sc=new Scanner(System.in);
	        System.out.println("enter value for a:");
		a=sc.nextInt();
		System.out.println("enter value for b:");
		b=sc.nextInt();
		System.out.println("enter value for c:");
		c=sc.nextInt();

		if((a==b ) && (b==c) && (a==c))
		{
			System.out.println("Triangle is Equilateral");
		}
		else if(a==b || a==c || b==c)
		{
			System.out.println("Triangle is Isolateral");
		}
		else
		{
			System.out.println("Triangle is Scalene");
		}
	}
}