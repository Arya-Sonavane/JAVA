public class PdfPattern14
{
	public static void main(String args[])
	{
		boolean b=false;
		
		for(int i=1 ; i<=5 ; i++)
		{	
			int no=i;
						
			for(int j=1 ; j<=5 ; j++)
			{
				if(i==1 ||j==1 || j==6-i )
				{
				      System.out.printf("%d ",no);
				      no++;	
				}
				else
				{
				   System.out.printf("  ");
				   no++;
				}
			}
		   System.out.println();
		}
	}
}