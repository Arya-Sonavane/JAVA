import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		int no , rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		no=sc.nextInt();
		int temp=no;
		int num=0;
		
		rem=no%10;
		 num=(num*10)+rem;
		no=no/10;
		
		rem=no%10;
	        num=(num*10)+rem;
		no=no/10;
		
		rem=no%10;
	        num=(num*10)+rem;
		no=no/10;
		
	
		String result = num==temp ? "it is a palindrome number " :"it is not palindrome number";
		System.out.println(result);
		
		
	}
}