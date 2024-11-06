import java.util.Scanner;
public class SumOfEvenOdd
{
	public static void main(String args[])
	{
		int no , SumOfEven=0, SumOfOdd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		no=sc.nextInt();
		int i=1;
		while(i<=no)
		{
			if(i%2==0)
			 {
				SumOfEven=SumOfEven+i;		
			 }
			else
			 {
				SumOfOdd=SumOfOdd+i;
			 }
			i++;
		}
		System.out.println(SumOfEven);
		System.out.println(SumOfOdd);

		
	}
}