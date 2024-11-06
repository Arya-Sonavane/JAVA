public class MergeArray
{
   public static void main(String args[])
   {
	int a[]={3, 5, 3, 2, 1};
	int b[]={5, 3, 7, 8};
	int c[]=new int[a.length+b.length];
	int i;
	int index=a.length;
	for(i=0; i<a.length;i++)
	{
	  c[i]=a[i];
	}
	for(i=0; i<b.length;i++)
	{
	  
	    c[index]=b[i];
	    index++;
	}

	System.out.println("Dispaly Merge Array Without Sort");
	for(i=0; i<c.length;i++)
	{
	  System.out.printf("%d\t", c[i]);
	}
	
	for(i=0; i<c.length; i++)
	{
	   int max=i;
	   for(int j=i+1; j<c.length; j++)
	   {
	     if(c[j]>c[max])
	      {
		max=j;
	      }
	   }
	   if(max!=i)
	   {
		int temp=c[i];
		c[i]=c[max];
		c[max]=temp;
	   }
		
	}
	System.out.println("\nDispaly Sorted Merge Array ");
	for(i=0; i<c.length;i++)
	{
	  System.out.printf("%d\t", c[i]);
	}


	

   }
}