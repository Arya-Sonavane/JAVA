public class PdfPattern18
{
	public static void main(String args[])
	{
		boolean b=false;
		for(int i=1 ; i<=5 ; i++)
		{
			b=true;
			for(int j=1; j<=17; j++)	
			{
				if((j>=10-i && j<=8+i)&&b)
				{
				System.out.print(i);
				b=false;
				}
				else
				{
				System.out.print("*");
				b=true;

				}
			}
			System.out.println(); 
		} 
		
	}
}