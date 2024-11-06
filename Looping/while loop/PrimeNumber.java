import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no , cnt=0;
		System.out.println("enter number");
		no=sc.nextInt();
		int i=1;
	
		while(i<=no/2)
		{	
			if(no%i==0)cnt++;
			i++;
		}
		
	System.out.println(cnt==1 ? "it is a prime" :"not prime");

	}
}
