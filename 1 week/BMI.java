import java.util.Scanner;
public class BMI
{
	public static void main(String args[])
	{
		float weight , height;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weight:");
		weight=sc.nextFloat();
		
		System.out.println("enter height:");
		height=sc.nextInt();

		float BMI=weight/height;
			
		if(BMI<18.5)
		{
			System.out.println("Person is under weight");
		}
		else if(BMI>18.5 && BMI<24.9)
		{
         		System.out.println("Person is Normal");
		}
		else if(BMI>25 && BMI<29.9)
		{
			System.out.println("Person is Over weight");
		}
		else if(BMI>30)
		{
			System.out.println("Person suffer from Obesity");

		}
	}
}
		
		
		
		
		

