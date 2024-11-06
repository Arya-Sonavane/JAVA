import java.util.Scanner;
public class LevelOfWater
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter water level:");
	   int WL=sc.nextInt();
		
		if(WL<=2000)
		{
			System.out.println("It time takes 25 minutes");

		}
		else if(WL>2000 && WL<=4000)
		{
			System.out.println("It time takes 35 minutes");
		}
		else if(WL>4000)
		{
			System.out.println("It time takes 45 minutes");
		}
		else
		{
			System.out.println("OverLoaded");
		}
	   
	}
	
}
    