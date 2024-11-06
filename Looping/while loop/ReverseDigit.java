// reverse no

import java.util.Scanner;
public class ReverseDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int rev=0;
		
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		System.out.println("number of digit :"+rev);

	}
}