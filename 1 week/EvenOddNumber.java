import java.util.Scanner;
public class EvenOddNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
	
		String result= no%2==0 ? "even number": "odd number";
		System.out.println(result);
		
	}
}