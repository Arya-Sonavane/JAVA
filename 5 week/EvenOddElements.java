import java.util.Scanner;
public class EvenOddElements
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	    int a[]=new int[5];
	    int even[]=new int[a.length];
	    int odd[]=new int[a.length];
	   // int ecnt=0, ocnt=0;

	   System.out.print("enter elements");
	   for(int i=0; i<a.length; i++)
	    {
		a[i]=sc.nextInt();
	    }

	    for(int i=0; i<a.length; i++)
	    {
		if(a[i]%2==0)
		{
		   even[i]=a[i];
		}
		else
		{
		  odd[i]=a[i];
		}
	    }

	  System.out.print("\neven numbers are: ");
	  for(int i=0; i<even.length; i++)
	    {
		System.out.print((even[i]>0) ? even[i]+"\t "  :"");
	    }

	  System.out.print("\nodd numbers are:  ");
	  for(int i=0; i<odd.length; i++)
	    {
		//System.out.print((odd[i]>0) ? odd[i]+"\t" :"");		 System.out.print(odd[i]+" ");

	    }

	}
}