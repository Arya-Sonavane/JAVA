import java.util.Scanner;
public class NaturalNumber
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int no=sc.nextInt();
	int i=1;
	
	do{
	   System.out.printf("%d\t",i++);
	   
	}while(i<=no);
   }
	
}