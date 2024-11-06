import java.util.Scanner;
public class ProfitLoss
{
	public static void main(String args[])
	{
		int cp, sp;
		int sub;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cost price:");
		cp=sc.nextInt();
		System.out.println("enter selling price:");
		sp=sc.nextInt();
		
		sub=sp-cp;
		
		if(sub>cp)
		{
			System.out.println("person got profit");
		}
		else
		{
			System.out.println("person got Loss");
		}
		

		
	}
}