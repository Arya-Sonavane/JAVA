import java.util.Scanner;
import java.lang.*;

public class PowerOfNumber
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int result=1;
	
	 System.out.println("Enter base");
	 int base=sc.nextInt();
	
	 System.out.println("Enter expotent");
	 int ex=sc.nextInt();
	
	for(int i=0; i<ex; i++)
	{
		result*=base;
	}
	
	System.out.println("Power of Number without inbuilt function is :"+result);

	double result1 = Math.pow(base, ex);
        System.out.println("Power of Number With inbuilt function: " + result1);
	}
}
	
		