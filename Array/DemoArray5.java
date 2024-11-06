
import java.util.Scanner;
public class DemoArray5    //four diamension array
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   int a[][][][]=new int[2][3][3][3]; // consider second bracket as row 						//and third braket as column

	    
	   for(int i=0; i<a.length;i++)
	    {
		for(int j=0; j<a[i].length;j++)
		{
		    for(int k=0 ; k<a[i][j].length;k++)
		    {
			for(int l=0; l<a[i][j][k].length; l++)
			{
			  a[i][j][k][l]=sc.nextInt();
			}
		    }
		}
	    }

	    for(int i=0; i<a.length;i++)
	    {
		for(int j=0; j<a[i].length;j++)
		{
		    for(int k=0 ; k<a[i][j].length;k++)
		    {
			for(int l=0; l<a[i][j][k].length; l++)
			{
			 System.out.printf("%d\t", a[i][j][k][l]);
			}
			 System.out.println();
		    }
		   System.out.println();
		}
		System.out.println();
	    }
	
	}
}