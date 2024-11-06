import java.util.Scanner;
public class MenuDriven5
{
	public static void main(String args[])
	{
		String result;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter Month");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println(" January Month is 31 Day");
				break;
			case 2:
				System.out.println(" Feb Month is 28 or 29 days");
				break;
			case 3:
				System.out.println(" March month is 31 days");
				break;
			case 4:
				System.out.println(" April month is 30 days");
				break;
			case 5:
				System.out.println(" May month is 31 days");
				break;
			case 6:
				System.out.println(" June month is 30 days");
				break;
			case 7:
				System.out.println(" July month is 31 days");
				break;
			case 8:
				System.out.println(" Aug month is 31 days");
				break;
			case 9:
				System.out.println("Sep month is 30 days");
				break;
			case 10:
				System.out.println(" Oct month is 31 days");
				break;
			case 11:
				System.out.println(" Nov month is 30 days");
				break;
			case 12:
				System.out.println(" Dec month is 31 days");
				break;
		
			default :
				System.out.println("enter valid option");

		}
		
	}
}