import java.util.Scanner;
public class SumOfDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three digit number ");
		int num=sc.nextInt();
		
		System.out.println("number before sum: "+num);
		int rem , sum=0;

		rem=num%10;
		num=num/10;
		sum=sum+rem;
		
		rem=num%10;
		num=num/10;
		sum=sum+rem;
		
		rem=num%10;
		num=num/10;
		sum=sum+rem;
		
		System.out.println("number after sum:"+sum);

	}
}
