import java.util.Scanner;
import java.lang.*;

public class CompoundInterest
{

	public static void main(String args[])
	{
	        Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for p :");
		float p=sc.nextFloat();
		
		System.out.println("Enter value for R :");
		float r=sc.nextFloat();

		System.out.println("Enter value for T :");
		float t=sc.nextFloat();
		
		double CI=p*(Math.pow((1+r/100),t));
		
		System.out.println("Compound Interest is : "+CI);
		
	}
}