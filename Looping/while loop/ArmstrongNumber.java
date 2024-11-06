import java.util.Scanner;
public class ArmstrongNumber
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter any number");
	   int no=sc.nextInt();
	   int  sum=0, temp=no;
	   while(no!=0)
	   {
		int rem=no%10;
		sum=sum+(rem*rem*rem);
		no/=10;
	   }
	   System.out.println(temp==sum ? "it is armstrong number: "+temp :"not armstrong");
	
	}
}