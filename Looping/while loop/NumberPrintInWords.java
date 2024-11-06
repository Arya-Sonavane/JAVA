import java.util.Scanner;
public class NumberPrintInWords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no, rem , rev=0;
		System.out.println("enter number");
		no=sc.nextInt();
		
		while(no!=0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no/=10;
		}
		
		while(rev!=0)
		{
			rem=rev%10;
			rev/=10;	
			switch(rem)
			{
			  case 0:
				 System.out.print("Zero ");
				 break;
			  case 1:
				 System.out.print("One ");
				 break;
			  case 2:
				 System.out.print("Two ");
				 break;
			  case 3:
				 System.out.print("Three ");
				 break;
		   	  case 4:
				 System.out.print("Four ");
				 break;
			  case 5:
				 System.out.print("Five ");
				 break;
			  case 6:
				 System.out.print("Six ");
				 break;
			  case 7:
				 System.out.print("Seven ");
				 break;
			  case 8:
				 System.out.print("Eight ");
				 break;
			  case 9:
				 System.out.print("Nine ");
				 break;
			 default:
				   System.out.println("enter valid number");

			}
		}
	}
}