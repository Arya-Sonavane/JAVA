import java.util.Scanner;
public class ReverseNaturalNumbers
{
	public static void main(String args[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		no=sc.nextInt();
		
		while(no!=0)
		{
			System.out.println(no);
			no--;
		}
	}
}