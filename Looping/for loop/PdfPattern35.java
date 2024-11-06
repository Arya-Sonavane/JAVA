public class PdfPattern35
{
	public static void main(String args[])
	{
		boolean b=false;
		int no=1;
		for(int i=1 ; i<=4 ; i++)
		{
			b=true;
			for(int j=1; j<=11; j++)	
			{
				if((j>=7-i && j<=5+i)&& b )
				{
				System.out.print(no++);
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