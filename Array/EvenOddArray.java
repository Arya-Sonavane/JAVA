public class EvenOddArray
{
   public static void main(String args[])
   {
	int a[]={5, 4,3 , 8, 7, 2, 1};
	int even[]=new int[a.length];
	int odd[]=new int [a.length];
	int i;
	System.out.println("Dispaly  Array ");
	for(i=0; i<a.length;i++)
	{
	  System.out.printf("%d\t", a[i]);
	}

	for(i=0; i<a.length; i++)
	{
	  if(a[i]%2==0)
	    even[i]=a[i];
	  else
	    odd[i]=a[i];
	}

	System.out.println("\nDispaly  Even Array ");
	for(i=0; i<even.length;i++)
	{
	  if(even[i]>0)
	  System.out.printf("%d\t", even[i]);
	}

	System.out.println("\nDispaly Odd Array ");
	for(i=0; i<odd.length;i++)
	{
	   if(odd[i]>0)
	   System.out.printf("%d\t", odd[i]);
	}


	
   }
}