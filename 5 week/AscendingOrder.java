import java.util.Scanner;
public class AscendingOrder
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   int a[]=new int[5];
	
	   System.out.print("enter elements");
	   for(int i=0; i<a.length; i++)
	    {
		a[i]=sc.nextInt();
	    }

	     System.out.println("\nBefore Ascending Order elements");
	   for(int i=0; i<a.length; i++)
	    {
		System.out.printf("%d\t", a[i]);
	    }


	    for(int i=0 ; i<a.length;i++)
	   {
		int min=i;
		for(int j=i+1; j<a.length;j++)
		{
		  if(a[j]<a[min])
		   {
			min=j;
		   }
		}
		if(min!=i)
		{
		  int temp=a[i];
		      a[i]=a[min];
		      a[min]=temp;
		}
	   }

	  System.out.println("\nAfter Ascending Order elements");
	   for(int i=0; i<a.length; i++)
	    {
		System.out.printf("%d\t", a[i]);
	    }

	}
}