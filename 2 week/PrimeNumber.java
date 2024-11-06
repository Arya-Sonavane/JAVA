import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no ;
		System.out.println("enter number");
		no=sc.nextInt();
		int i=1;
		boolean flag=false;
	
		while(i<=no/2)
		{	
			if(no%i==0)
			{
				flag=true;
				break;
			}
			i++;
		}
		String result= !flag ? "not prime" :"its a prime number";
		System.out.println(result);

	}
}
