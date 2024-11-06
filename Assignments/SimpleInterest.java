import java.util.Scanner;
public class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle , time and rate");
		int P=sc.nextInt();
		int T=sc.nextInt();
		float R=sc.nextFloat();
	
		float SI=(P*T*R)/100;
		System.out.println("Simple Interest is :"+SI);
	}
}