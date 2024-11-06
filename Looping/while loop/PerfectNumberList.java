import java.util.Scanner;
public class PerfectNumberList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		
		int j=1;
		while(j<=no)
		{
		    int i=1 , sum=0 , temp=j ;
		    while(i<j)
		    {
		      sum=(j%i==0)?sum+=i:sum;
		      i++;
		    }
		  System.out.print(temp==sum? temp+" " :"");
		  j++;
		}
	}
}