import java.util.Scanner;
public class LCM
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=(a>b) ? a : b;
		int i=max , lcm=1;
		while(true)
		{
			if(max % a==0 && max % b==0)
			{
				lcm=max;
				System.out.printf("LCM of %d and %d = %d", a, b, lcm);
				break;
			}
			++max;
		}
		
	}
}