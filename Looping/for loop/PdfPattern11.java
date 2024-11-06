public class PdfPattern11 //hollow digit triangle
{
	public static void main(String args[])
	{
		for (int i = 1; i <= 5; i++)
		 {
           	    for (int j = 1; j <= 5; j++)
		    {
                	if (j == 1 || i == j || i==5)
			{
                         System.out.print(j + " ");
                	}
			else
			{
                 	   System.out.print("  ");
               		}
            	    }
           	    System.out.println();
        	 }
	}
}