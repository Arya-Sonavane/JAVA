public class PdfPattern28
{
	public static void main(String args[])
	{	
		for( int i=1 ; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
	       		    if(((j<=i && i<=6) || (j>=11-i && i<=6 )) || ((j<=11-i && i>6) || (j>=i && i>6) ))
			     {
				System.out.print("*");
			     }
			     else
			     {
				System.out.print(" ");
			     }
			}
			System.out.println();
		}

	}
}