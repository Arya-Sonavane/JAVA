import java.util.Scanner;
public class DigitCount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int cnt=0;
		
		while(no!=0)
		{
			int rem=no%10;
			no=no/10;
			cnt++;
		}
		System.out.println("number of digit :"+cnt);

	}
}