import java.util.Scanner;
public class StrongNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no , i,f fact , sum;
		System.out.println("enter number");
		no=sc.nextInt();
		int temp=no;
		sum=0;
		while(no!=0)
		{
			int rem=no%10;
			fact=1;
			i=1;			
			while(i<=rem)
			{
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			no=no/10;
		}
		System.out.println("Sum Is : "+sum);
		String result= sum==temp ? "It is a strong number" : "it is a not strong number";
		System.out.println(result);
		
	}
}