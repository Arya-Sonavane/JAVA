import java.util.Scanner;
public class Person
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person height in centimeter:");
		float height=sc.nextFloat();
		
		String result = height < 150.0 ? "The person is Dwarf" : 
				(height >=150.0 && height <165.0 ? "The person is average heighted." :
				(height >=165.0 && height <=195.0 ? "The person is taller":"no"));
		System.out.println(result);

	}
}