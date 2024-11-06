import java.util.Scanner;
public class SumOfDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			no=no/10;
			sum=sum+rem;
		}
		System.out.println("number of digit :"+sum);

	}
}