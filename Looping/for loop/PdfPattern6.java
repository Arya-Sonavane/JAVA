public class PdfPattern6
{
	public static void main(String args[])
	{
		boolean b=false;
		for(int i=1 ; i<=6 ; i++)
		{
			b=true;
			for(int j=1; j<=11; j++)	
			{
				if((j>=7-i && j<=5+i)&& b )
				{
				System.out.print("*");
				b=false;
				}
				else
				{
				System.out.print(" ");
				b=true;

				}
			}
			System.out.println(); 
		} 
		
	}
}