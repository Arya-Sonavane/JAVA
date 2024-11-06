import java.util.Scanner;
public class Grade
{
	public static void main(String args[])
	{
		int Phy , Che , Math , Bio , Com , Total ;
		float per;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for Physics:");
		Phy=sc.nextInt();
		System.out.println("Enter marks for Chemistry: ");
		Che=sc.nextInt();
		System.out.println("Enter marks for Biology: ");
		Bio=sc.nextInt();
		System.out.println("Enter marks for Math :");
		Math=sc.nextInt();
		System.out.println("Enter marks for Computer: ");
		Com=sc.nextInt();


		Total=Phy+Che+Math+Bio+Com;
		
		per=(Total*100)/500;

		if(per>=90)
		{
			System.out.println("Grade A -  Percentage is :"+per);
		}
		else if(per>=80)
		{
			System.out.println("Grade B - Percentage is :"+per);
		}
		else if(per>=70)
		{
			System.out.println("Grade C - percentage is:"+per);
		}
		else if(per>=60)
		{
			System.out.println("Grade D - percentage is:"+per);
		}
		else if(per>=40)
		{
			System.out.println("Grade E - percentage is:"+per);
		}
		else if(per<40)
		{
			System.out.println("Grade F - percentage is:"+per);
		}
	}
}

