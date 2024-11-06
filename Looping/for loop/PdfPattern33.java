public class PdfPattern33
{
	public static void main(String args[])
	{
		for(int i=1; i<=4; i++)
		{
		   for(int j=1 ; j<=7; j++)
		   {
			System.out.print((j>4-i && j<=8-i ) ? "*" : " ");
		   }
		   System.out.println();
		}
	}
}