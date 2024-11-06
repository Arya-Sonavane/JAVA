import java.util.Scanner;
public class MaxMainValue
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	 System.out.println("enter values");
	   for(int i=0; i<a.length;i++)
	    {
		a[i]=sc.nextInt();
	    }
	    
	    System.out.println("display values");
	   for(int i=0; i<a.length;i++)
	    {
		System.out.printf("%d\t", a[i] );	
	    }
	    int max=0 , min=0;
	   
	    for(int i=0; i<a.length; i++)
	     {
		min=a[i];
		if(a[i]>max)
		{
		  max=a[i];
		}
		else if(a[i]<min)
		{
		  min =a[i];
		}
	     }
	    System.out.println("\nMax number is :"+max);
	    System.out.println("Min number is :"+min);
	     


	
   }
}