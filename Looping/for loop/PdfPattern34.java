public class PdfPattern34
{
	public static void main(String args[])
	{
		for(int i=1; i<=4; i++)
		{
		   for(int j=1 ; j<=7; j++)
		   {
		     System.out.print(((j==5-i || j==8-i) || 
				      (i==1 && j>=4 && j<=7) ||
				      (i==4 && j>=2 && j<=4)) ? "*" : " ");
		   }
		   System.out.println();
		}
	}
}