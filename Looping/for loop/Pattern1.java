public class Pattern1
{
	public static void main(String args[])
	{
		 for (int i = 1; i <= 5; i++)
		 {
			System.out.printf("%d  ",i);
            		for (int j = 4; j >= 1; j--)
			 {
               			 if (i == 5) 
				{
                   		 System.out.printf("%d  ",j);
                		}
           		 }
           		 
           	 System.out.printf("\n\n");
        	}  
	}
}