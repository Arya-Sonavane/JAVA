import java.util.Scanner;

public class VoterEligibility
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter age:");
	   int age=sc.nextInt();
	   String result = age>18 ? " This persong is eligible for Votting" : " Not eligible for votting";
	   System.out.println("Result is "+result);
	}
}
	