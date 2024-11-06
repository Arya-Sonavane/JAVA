import java.util.Scanner;
public class MegerArrayInDec
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[3];
	  int b[]=new int[3];
	  int c[]=new int[a.length+b.length];
	  int i, j ,k=0;
	 System.out.println("enter elements for first array ");
	   for( i=0; i<a.length; i++)
	    {
		a[i]=sc.nextInt();
		c[k]=a[i];
		k++;
	    }

	  System.out.println("enter elements for second array");
	   for( j=0; j<b.length; j++)
	    {
		b[j]=sc.nextInt();
		c[k]=b[j];
		k++;

      	    }

	    for( i=0; i<c.length; i++)
	    {
		int max=i;
		for(j=i+1; j<c.length; j++)
		{
		   if(c[j]>c[max])
		     max=j;
		}
		if(max!=i)
		{
		   int temp=c[i];
		   c[i]=c[max];
		   c[max]=temp;
		}
	    }

	   System.out.println("Display after merge array");
            
	    for( i=0; i<c.length; i++)
	    {
		System.out.printf("%d\t",c[i]);
	    }
	}
}