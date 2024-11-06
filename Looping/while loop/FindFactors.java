import java.util.Scanner;
public class FindFactors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int i=1;
		while(i<=no)
		{
		    if(no%i==0)
		    {
			System.out.printf("%d\t", i);
		    }
		    i++;
		}
	}
}