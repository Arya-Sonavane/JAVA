import java.util.Scanner;

public class MaxNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
	int b=sc.nextInt();
	System.out.println("Enter c:");
	int c=sc.nextInt();
	
	if(a>b && a>c)
	{
		System.out.println("a is max number");
	}
	else if(b>a && b>c)
	{
		System.out.println("b is max number");
	}
	else
	{
		System.out.println("c is max number");
	}
		
}


}