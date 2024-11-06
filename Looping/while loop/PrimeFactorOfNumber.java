import java.util.Scanner;
public class  PrimeFactorOfNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no ;
		System.out.println("enter number");
		no=sc.nextInt();
		int i=2 , sum=0;
	
		while(i<no)
		{	int div=2 , cnt=0;
			while(div<=no)
			{
			  if(i%div==0){cnt++;}
			   div++;
			}
		  System.out.print(" "+(cnt==1 ? (no%i==0)? i :"":""));

		  i++;
		}
	      
	}
}
