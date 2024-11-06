public class PdfPattern15
{
	public static void main(String args[])
	{
	   int no=1;
	    for(int i=1; i<=5; i++)
	     {
		int a=1;
		if(i!=1)
		{
		  no=no+2;
		}
		for(int j=1; j<=no; j++)
		{
		   
		  if(j<=i)
			{
		         System.out.printf("%d",a++);
			}
			else 
			{
			   a=no-j;                                      			   System.out.printf("%d",++a);		
			}
		    
		}
		System.out.println();
	     }
	}
}