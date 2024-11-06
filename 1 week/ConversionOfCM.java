import java.util.Scanner;
public class ConversionOfCM
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Length in cm");
		float length=sc.nextInt();
		
		float m=length/100f;
	
		double km=length*0.00001;

		System.out.println("length in meters: "+m);
		System.out.println("length in km: "+km);
	}
}