import java.util.Scanner;
public class MenuDriven2
{
	public static void main(String args[])
	{
		int a , b;
		String result;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Check Even Odd Number");
		System.out.println("2.Check Number is  Positive , Negative or Zero");
		System.out.println("3.Check Maximum Number");
		System.out.println("enter choice");
		int choice = sc.nextInt();
	
		switch(choice)
		{
			case 1:
				System.out.println("enter number");
				a=sc.nextInt();
				result=a%2==0 ? "Number is Even" :"Number is Odd";
				System.out.println(result);
				break;
			
			case 2:
				System.out.println("enter number");
				a=sc.nextInt();
				 result= a>0 ? "Number is positive" :(a==0 ? "Number is Zero" : "Number is Negative");
				System.out.println(result);
				break;

			case 3:
				System.out.println("enter two values");
				a= sc.nextInt();
				b=sc.nextInt();
				 result = a>b ? "a is max number" : " b is max number";
				System.out.println(result);
				break;
			
			default:
				System.out.println("enter valid choice");
		}
		
	}
}