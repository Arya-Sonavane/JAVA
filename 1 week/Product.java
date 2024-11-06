import java.util.Scanner;

public class Product
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product Quantity:");
		int qty=sc.nextInt();
		System.out.println("Enter product rate:");
		int rate=sc.nextInt();
		
		int total=qty*rate;
		System.out.printf("product bill without GST : %d\n", total);
		
		int gstrate=total*18/100;
		total=total*gstrate;
		System.out.printf("product bill with GST: %d\n", total);
		

		
	}	
}	