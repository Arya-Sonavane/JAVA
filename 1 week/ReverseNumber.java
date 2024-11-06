import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String args[])
	{
		int no , rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		no=sc.nextInt();
		int temp=no;
		System.out.println("before reverse:"+temp);
		int num=0;
		
		 rem=(no%10)*100 +((no/10)%10)*10+no/100;
	
		System.out.println("after reverse:"+rem);
		
	}
}