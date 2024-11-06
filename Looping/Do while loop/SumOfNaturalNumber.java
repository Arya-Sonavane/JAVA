import java.util.Scanner;
public class SumOfNaturalNumber
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int no=sc.nextInt();
	int i=1 , sum=0;
	
	do{
	   sum+=i;
	   i++;
	  }while(i<=no);
	System.out.println(sum);
	
   }
	
}