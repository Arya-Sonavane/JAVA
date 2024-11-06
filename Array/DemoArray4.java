
import java.util.Scanner;
public class DemoArray4   // two diamension array
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   int a[][][]=new int[3][3][3]; // consider second bracket as row and 						//third braket as column

	    
	   for(int i=0; i<a.length;i++)
	    {
		for(int j=0; j<a[i].length;j++)
		{
		    for(int k=0 ; k<a[i][j].length;k++)
		    {
			a[i][j][k]=sc.nextInt();
		    }
		}
	    }

	    for(int i=0; i<a.length;i++)
	    {
		for(int j=0; j<a[i].length;j++)
		{
		    for(int k=0 ; k<a[i][j].length;k++)
		    {
			System.out.printf("%d\t", a[i][j][k]);
		    }
		   System.out.println();
		}
		System.out.println();
	    }
	
	}
}