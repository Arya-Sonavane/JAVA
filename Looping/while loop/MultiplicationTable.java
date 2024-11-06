import java.util.Scanner;
public class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		
		int i=1;
		while(i<=10)
		{
			System.out.println(no*i);
			i++;
		}
	}
}