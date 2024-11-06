import java.util.Scanner;

public class Speed
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance:");
		float d=sc.nextFloat();
		
		System.out.println("Enter Time:");
		float t=sc.nextFloat();
		
		float speed=d/t;

		System.out.println("Total Speed is: "+speed);

	}
}