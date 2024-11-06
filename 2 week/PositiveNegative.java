import java.util.Scanner;
public class PositiveNegative
{
	public static void main(String args[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for number:");
		no=sc.nextInt();
		
		if(no>0)
		{
			System.out.println("Number is Positive");
		}
		else if(no==0)
		{
			System.out.println("Number is Zero");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
}