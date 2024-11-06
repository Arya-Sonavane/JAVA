import java.util.Scanner;
public class WithdrawAmount
{
	public static void main(String args[])
	{
		int WA;
		double BB=2000;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdraw amount");
		WA=sc.nextInt();
		System.out.println("Amount to Withdraw : " +WA);
		
		if(WA<=BB && WA+0.50 <= BB)
		{
			if(WA % 5==0)
			{
				double total=WA+0.50;
				System.out.println("Withdrwal amount with charges : "+total);
				BB=BB-total;
				System.out.println("Transaction Successful. Remaining balance is: "+BB);
			}
			else
			{
				System.out.println("Withdrawal amount must be a multiple of 5.");
			}
		}
		else
		{
			System.out.println(" Insufficient Balance");
		}
	}

}