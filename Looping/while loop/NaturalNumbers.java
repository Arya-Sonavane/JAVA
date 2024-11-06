import java.util.Scanner;
public class NaturalNumbers
{
	public static void main(String args[])
	{
		int no , i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		no=sc.nextInt();
		while(i<=no)
		{
			System.out.println(i);
			i++;
		}

	}
		
}