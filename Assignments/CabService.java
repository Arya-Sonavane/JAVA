import java.util.Scanner;
public class CabService
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int XX , YY;
		System.out.println("enter value for first cab:");
		XX=sc.nextInt();
		System.out.println("enter value for second cab:");
		YY=sc.nextInt();
		
		if(XX<YY)
		{
			System.out.println("Customer will take First Cab: "+XX); 
		}
		else if(XX==YY)
		{
			System.out.println("Customer will take Any Cab: "+ XX +"  or " +YY);
		}
		else
		{
			System.out.println("Customer will take Second Cab: "+YY);
		}


	}
}