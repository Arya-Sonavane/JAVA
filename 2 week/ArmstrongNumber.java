import java.util.Scanner;
public class ArmstrongNumber
{
	public static void main(String args[])
	{
		int no , sum=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		no=sc.nextInt();
		int temp=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		String result=sum==temp ? "Number is Armstrong" : "Number is Not Armstrong";
		System.out.println(result);

		
	}
}
