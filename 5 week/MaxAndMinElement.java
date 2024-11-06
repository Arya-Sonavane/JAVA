import java.util.Scanner;
public class MaxAndMinElement
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

	   for(int i=0 ; i<a.length;i++)
	   {
		int max=i;
		for(int j=i+1; j<a.length;j++)
		{
		  if(a[j]>a[max])
		   {
			max=j;
		   }
		}
		if(max!=i)
		{
		  int temp=a[i];
		      a[i]=a[max];
		      a[max]=temp;
		}
	   }
	   System.out.println("Max number is:"+a[0]);
	   System.out.print("Min number is:"+a[4]);

	   
	
	  
	}
}