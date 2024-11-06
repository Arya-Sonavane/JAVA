public class PdfPattern41
{
	public static void main(String args[])
	{
		int no=1;
		int ch=65;
		for(int i=1; i<=5; i++)
		{
		   for(int j=1; j<=no; j++)
		   {
			if(j>=i  )
			{  
		           System.out.printf("%c", ch++);
			}
			else{
			   System.out.printf("%c", ch--);
			}
		   }
		    
		    no+=2;
		   System.out.println();
		}
	}
}