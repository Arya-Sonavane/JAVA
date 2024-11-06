import java.util.Scanner;
public class PrimeList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no ;
		System.out.println("enter number");
		no=sc.nextInt();
		int i=1 , j=2 ;
		boolean flag=false;
	      while(j<=no)
		{
			int cnt=0;
		  while(i<=j/2)
		  {	
			if(j%i==0)
			{
				cnt++;
			}
			i++;
		  }
		if( cnt==0 )
		System.out.println("its a prime number "+j);
		j++;
	      }
		

	}
}
