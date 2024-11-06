import  java.util.Scanner;
public class SimpleInterest
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

		float simpleInterest=p*r*t/100;
		
		System.out.println("Simple Interest is : "+simpleInterest);
	}
}