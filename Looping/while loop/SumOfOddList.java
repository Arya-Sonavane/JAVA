import java.util.Scanner;
public class SumOfOddList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int i=1 , Sum=0;
		
		while(i<=no)
		{
			if(i%2!=0)
			{
				Sum=Sum+i;
			}
			i++;
		}
		System.out.println("Sum of Odd Digits is :"+Sum);
	}
}