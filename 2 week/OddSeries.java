import java.util.Scanner;
public class OddSeries
{
	public static void main(String args[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		no=sc.nextInt();
		int i=1;
		while(i<=no)
		{
			if(i%2!=0)
			 {
				System.out.println(i);		
			 }
			i++;
		}
	}
}