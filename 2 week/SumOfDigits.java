import java.util.Scanner;
public class SumOfDigits 
{
	public static void main(String args[])
	{
		int no , rem,sum=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		no=sc.nextInt();
		
		while(no!=0){
		  rem=no%10;		
		  no=no/10;
		  sum=sum+rem;
		 }
		System.out.println(sum);
	}
}