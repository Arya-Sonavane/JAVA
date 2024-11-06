import java.util.Scanner;
public class EzioGaurds
{
	public static void main(String args[])
	{
		int XX , YY;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for XX and YY : ");
		XX=sc.nextInt();
		YY=sc.nextInt();

		if(XX>=YY && XX >= YY-XX+1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("NO");
		}
	}
	
}