import java.util.Scanner;
public class TvVolume
{
	public static void main(String args[])
	{
		int XX , YY;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter value for XX and YY : ");
		XX=sc.nextInt();
		YY=sc.nextInt();

		if(XX>YY)
		{
			System.out.println(XX-YY);
		}
		else
		{
			System.out.println(YY-XX);
		}
		
	}
}