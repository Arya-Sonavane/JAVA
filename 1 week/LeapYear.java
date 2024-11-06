import java.util.Scanner;
public class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		
		String result= year%4==0 ? "This year is leap year" : "This year is not leap year";
		System.out.println(result);
	}
}
