public class PdfPattern27
{
	public static void main(String args[])
	{
	     for(int i=1; i<=10; i++)
     	      {
		 for(int j=1; j<=10;j++)
		 {
		    if((j<7-i || j>=5+i) || (i>=5+j || j>=16-i) )
		    {
			 System.out.printf("*");
		    }
		    else
		    {
 	   	     System.out.printf(" ");
	   	    }
	         }
                 System.out.printf("\n");
              }
 
	}
} 