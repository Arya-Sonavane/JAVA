public class PdfPattern40
{
	public static void main(String args[])
	{
	   
	   for(int i=1; i<=5; i++)
	   {
		int ch=65;
		for(int j=1; j<=9; j++)	
		{
			if(j<=6-i || j>=4+i)
	  		{ 
			   System.out.printf("%c",(j<5)?ch++:--ch);
	   		}
	   		else
			{
 	    		  System.out.printf(" ");
	  		}
	         }
		System.out.println();
	   }
	}
}