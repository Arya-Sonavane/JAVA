public class PdfPattern8 //hollow triangle
{
	public static void main(String args[])
	{
		boolean b=false;
		for(int i=1; i<=6; i++)
		{
		   b=true;
		   for(int j=1; j<=11; j++)
		     {
			if( (i==6 || j==7-i || j==5+i) && b)
			 {
				System.out.printf("*");
				b=false;
			 }
			else
			 {
				System.out.printf(" ");
				b=true;
			 }
		     }
		    System.out.printf("\n");
		}
	}
}