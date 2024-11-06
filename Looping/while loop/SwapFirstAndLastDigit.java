import java.util.Scanner;
public class SwapFirstAndLastDigit
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int no=sc.nextInt();
	int lastDigit=no%10;
	int firstDigit=no;
	while(firstDigit>9)
	{
		firstDigit/=10;
	}
	System.out.println("First Digit of number is: "+firstDigit);
	System.out.println("Last Digit of number is: "+lastDigit);
	}
}