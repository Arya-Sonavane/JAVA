import java.util.Scanner;
public class ProductOfNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		int product=1;

		while(no!=0)
		{
			product=product*(no%10);
			no=no/10;
		}
		System.out.println(product);
	}
}