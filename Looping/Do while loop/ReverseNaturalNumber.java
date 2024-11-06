import java.util.Scanner;
public class ReverseNaturalNumber
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number");
	  int no=sc.nextInt();
         do{
		System.out.printf("%d\t", no);
		no--;
	   }
	   while(no>=1)
	}
}
