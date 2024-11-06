import java.util.Scanner;
public class NaturalNumber
{
	public static void main(String args[])
	{
		int no, i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		no=sc.nextInt();
		while(i<=no)
		{
			System.out.println(i);
			i++;
		}
		
	}
}