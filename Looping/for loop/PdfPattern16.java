

public class PdfPattern16
{
	public static void main(String args[])
	{	
	   int no=1,r;
	    for(int i=1; i<=5; i++)
	     {
		int ch=64;
		for(int j=1; j<=no; j++)
		{
			 
      			if(j<=i)
			{
		         System.out.printf("%c",++ch);
			  			}
			else 
			{
			                                        			    			System.out.printf("%c",--ch);		
			}

							
		}
		no+=2;
		System.out.println();
	     }
	}
}