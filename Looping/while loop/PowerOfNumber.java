import java.util.Scanner;
public class PowerOfNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for base and index");
		int base=sc.nextInt();
		int index=sc.nextInt();
		int i=1 , pow=0;
		while(i<=index)
		{
		   pow=pow+(base*index);
		   i++;
		}
		System.out.println(pow);
		
	}
}