public class Pattern4
{
	public static void main(String args[])
	{

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i<=j)
				{
				  System.out.printf("*");
				}
				else
				{
				   System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
		
	}
}








/*

* * * * *
  * * * *
    * * *
      * *
        *

my logic
	for(int i=5; i>0; i--)
		 {
			for(int k=5; k>i; k--)
			{
			   System.out.printf(" ");
			}
			for(int j=1; j<=i; j++)
			{
			   System.out.printf("*");
			}
			System.out.printf("\n");
		 }

*/