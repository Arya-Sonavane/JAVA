public class PdfPattern36
{
	public static void main(String args[])
	{       
		int no=1;
		for(int i=1; i<=5; i++)
		{
		    for(int j=1; j<=10; j++)
		    {   
			if(no==0)  no=1; else no=0;
			System.out.print((i>=j || j>=11-i) ? no : " ");
		    }
		    System.out.println();
		}
	}
}