 //Full Pyramid

class PdfPattern
{
}

public class PdfPattern12 
{
	public static void main(String x[])
	{		
		for(int i=1; i<=5; i++)
		{
		     int num = i;
                  for (int j = 1; j <= 9; j++) 
		   {
                       if (j >= 6 - i && j <= 4 + i)
		        {
                   	   System.out.print(num + " ");
                  	   if (j < 5)
			   {
                    	    num++;
                    	   } else
			   {
                    	    num--;
                   	   }
               	       }
		       else 
			{
                    	  System.out.print("  ");
                   	}
		    }
		  System.out.println();
		}
	}
}