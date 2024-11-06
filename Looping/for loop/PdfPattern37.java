public class PdfPattern37
{
	public static void main(String args[])
	{       
		
		for(int i=1; i<=5; i++)
		{
		    int no=1;
		    for(int j=1; j<=10; j++)
		    {   
			if(i>=j || j>=11-i) { 
 			   System.out.print((j<=i) ? no++ : --no );
			 }
			else
			{
			 System.out.print(" ");
			}
			
		    }
		    System.out.println();
		}
	}
}