import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int no , sum=0 , i=1;
		System.out.println("enter number");
		no=sc.nextInt();
		
		while(i<no)
		{
			if(no%i==0)
			{sum=sum+i;
			}
			i++;
		}
		String result= sum==no ? "it is a perfect number" :"it is a not perfect number";
		System.out.println(result);
	}
		
}