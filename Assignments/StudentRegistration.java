import java.util.Scanner;
public class StudentRegistration
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int NN , MM , KK;
		int remainingSeat;
		
		System.out.println("enter friend group:");
		NN=sc.nextInt();
		System.out.println("enter capacity of course:");
		MM=sc.nextInt();
		System.out.println("enter already registered students:");
		KK=sc.nextInt();
		
		remainingSeat=MM-KK;
		
		if(NN <= remainingSeat)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}