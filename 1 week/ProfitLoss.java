import java.util.Scanner;
public class ProfitLoss
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter selling amount:");
		int sp=sc.nextInt();
	
		System.out.println("Enter Buying amount:");
		int bp=sc.nextInt();
	
		String result=sp>bp ? "User have profit "+(sp-bp) : "User have Loss "+(sp-bp);
		
		System.out.println("Result is:"+result);

	}
}