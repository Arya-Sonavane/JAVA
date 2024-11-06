public class PdfPattern7
{
	public static void main(String args[])
	{
		boolean b=false;
		for(int i=6 ; i>0 ; i--)
		{
			b=true;
			for(int j=11; j>0; j--)	
			{
				if((j>=7-i && j<=5+i)&&b)
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