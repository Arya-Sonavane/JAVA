import java.util.Scanner;
public class ArthmaticMenuDriven
{
	public static void main(String args[])
	{
		int a , b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter choice:");
		int choice=sc.nextInt();

		switch(choice)
		{
			case 1 :
				System.out.printf("Addition is %d\n ", a+b);
				break;
			
			case 2 :
				System.out.printf("Substraction is %d\n ", a-b);
				break;
		
			case 3 :
				System.out.printf("Multiplication is %d\n ", a*b);
				break;
		
			case 4 :
				System.out.printf("Division is %d\n " , a/b);
				break;

			default :
				System.out.println("Enter valid option");
				break;
		}
		
	}
}