import java.util.Scanner;
public class FindFirstAndLast
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();

		int lastDigit=no%10;
		int firstDigit=0;
			
		while(no != 0)
                {
           		 firstDigit = no % 10;
           		 no = no / 10;
        	}
        
		System.out.println("First Digit is  : " + firstDigit + " \t Last Digit is: "+lastDigit);
		
		
		
	}
}