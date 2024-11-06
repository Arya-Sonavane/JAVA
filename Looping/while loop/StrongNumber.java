import java.util.Scanner;
public class StrongNumber
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter number");
	   int num=sc.nextInt();
	   
	   int sum=0, temp=num;
	   while(num!=0)
	   {
		int rem=num%10;
		int j=1 , a=1;
		while(j<=rem)
		{
		   a=a*j;
		   j++;
		}
		sum=sum+a;
	        num/=10;
           }	
	 System.out.print(temp==sum?"it is strong number: "+temp :"It is not strong ");
        }
}