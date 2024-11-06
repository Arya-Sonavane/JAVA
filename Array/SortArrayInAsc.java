import java.util.Scanner;
public class SortArrayInAsc
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int i;
	 System.out.println("enter values");
	   for( i=0; i<a.length;i++)
	    {
		a[i]=sc.nextInt();
	    }
	    
	    System.out.println("display values before sorting");
	   for( i=0; i<a.length;i++)
	    {
		System.out.printf("%d\t", a[i] );	
	    }
	
	   for( i=0; i<a.length; i++ )
	   {
		int min=i;
		for(int j=i+1; j<a.length; j++)
	        {
		   if(a[min]>a[j])
		    min=j;
	       }
		if(min!=i)
		{
		   int temp=a[i];
		   a[i]=a[min];
		   a[min]=temp;
		}
	   }
	   System.out.println("\ndisplay values after sorting");
	   for( i=0; i<a.length;i++)
	    {
		System.out.printf("%d\t", a[i] );	
	    }

   }
}