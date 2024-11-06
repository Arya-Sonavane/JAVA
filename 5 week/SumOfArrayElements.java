import java.util.Scanner;
public class SumOfArrayElements
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
             int sum=0 ;
	     int a[]=new int[5];
	     System.out.println("enter values");

	     for(int i=0; i<a.length ; i++)
	     {
		a[i]=sc.nextInt();
		sum+=a[i];
 	     }

	     for(int i=0; i<a.length;i++)
	     {
		System.out.printf("%d\t",a[i]);
 	     }
	     System.out.println("\t sum:"+sum);
	     
	     
	}
}