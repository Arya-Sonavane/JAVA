import java.util.Scanner;
public class ArmstrongList
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter number");
	   int no=sc.nextInt();
	   int i=1 ;
	   while(i<=no)
	   {
		int temp=i, j=i;
		int sum=0;
		while(j!=0)
		{
		   int rem=j%10;
		   sum=sum+(rem*rem*rem);
		   j/=10;
		   
		}
		System.out.print(temp==sum? temp+" ":"");
		i++;
	   }
	   
	}
}