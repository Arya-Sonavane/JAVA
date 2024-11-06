import java.util.Scanner;
public class Temprature
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temprature: ");
		float temp=sc.nextFloat();
	
		float f=(temp * 9/5) + 32;

		System.out.println("Temprature in Faranite: "+f);

		float c= (f - 32) * 5/9;
		System.out.println("Temprature in celcius: "+c);
		
	}
}