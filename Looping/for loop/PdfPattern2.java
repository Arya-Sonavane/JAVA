public class PdfPattern2
{
	public static void main(String args[])
	{
		for(int i=1; i<=3; i++)
		{
		   for(int j=1; j<=5; j++)
		    {    			
			String s=(i==1) || (j==1) || (i==3) || (j==5) ? "*" : " ";
			System.out.printf(s);
		    }
		   System.out.printf("\n");
		}
	}
}
