import java.util.Scanner;
public class IQTest
{
	public static void main(String args[])
	{
		int XX;
		int Einstein_IQ=170;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter chef IQ after After learning a musical instrument");
		XX=sc.nextInt();
		
		if(XX > Einstein_IQ)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}