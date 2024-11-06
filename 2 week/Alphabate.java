import java.util.Scanner;
public class Alphabate
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value");
		s=sc.next();
		char ch=s.charAt(0);

		if(ch>='a' && ch<='z' ||ch>='A' &&ch<='Z')
		{
			System.out.println("This is Alphabate");
		}
		else
		{
			System.out.println("This is not a alphabate");
		}
	}
}