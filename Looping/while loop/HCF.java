import java.util.Scanner;
public class HCF
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=a>b ? b : a;
		int i=1 , hcf=1;
		while(i<=result)
		{
			if(a % i==0 && b % i==0)
			{
				hcf=i;
			}
			i++;
		}
		System.out.println(hcf);
	}
}