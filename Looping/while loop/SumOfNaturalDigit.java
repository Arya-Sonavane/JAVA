import java.util.Scanner;
public class SumOfNaturalDigit
{
	public static void main(String args[])
	{
		int no , i=1 , sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number");
		no=sc.nextInt();
		while(i<=no)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of natural numbers is:"+sum);
	}
}