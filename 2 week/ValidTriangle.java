import java.util.Scanner;
public class ValidTriangle
{
	public static void main(String args[])
      {
	int a, b, c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value for a:");
	a=sc.nextInt();
	System.out.println("enter value for b:");
	b=sc.nextInt();
	System.out.println("enter value for c:");
	c=sc.nextInt();
	
	if((a+b>c) && (b+c>a) && (a+c>b))
	{
		System.out.println("Triangle is valid");
	}
	else
	{
		System.out.println("Triangle is invalid");
	}
     }

}