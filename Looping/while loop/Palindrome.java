import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int rev=0;
		int temp=no;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		
		if(rev==temp)
		{ System.out.println("Number is Palindrome");}
		else
		{System.out.println("Number is not Palindrome");}
					

	}
}