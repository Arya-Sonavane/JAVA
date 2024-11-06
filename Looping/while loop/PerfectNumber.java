import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		
		int i=1 , sum=0;
		int temp=no;
		while(i<no)
		{
		   sum=(no%i==0)?sum+=i:sum;
		   i++;
		}
		System.out.println(temp==sum?"it is perfect number:"+sum :"not perfect ");
	}
}