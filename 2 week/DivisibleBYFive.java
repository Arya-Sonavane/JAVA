import java.util.Scanner;
public class DivisibleByFive
{
	public static void main(String args[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		no=sc.nextInt();
		
		if(no%5==0 && no%11==0)
		{
			System.out.println("Number is Divisible by 5 and 11");
		}
		else
		{
			System.out.println("Number is  not Divisible by 5 and 11");
		}
	}
}