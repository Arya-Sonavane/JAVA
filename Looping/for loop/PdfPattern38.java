public class PdfPattern38
{
	public static void main(String args[])
	{        
		int no=9;
		for(int i=1; i<=5; i++)
		{
			int a=1;
			for(int j=1; j<=no; j++)
			{
			   System.out.print((j<6-i?a++:a--));		
			}
			no-=2;
			System.out.println();
		     
		}
	}
}