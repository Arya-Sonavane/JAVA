import java.util.Scanner;
public class DemoArray3  // two diamension array
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int a[][]=new int[3][3];
          
	  for(int i=0; i<a.length;i++)
	     {
		for(int j=0; j<a[i].length;j++)
		 {
		    a[i][j]=sc.nextInt();
		 }
	     }

	   for(int i=0; i<a.length;i++)
	     {
		for(int j=0; j<a[i].length;j++)
		 {
		    System.out.printf("%d\t",a[i][j]);
		 }
		System.out.println();
	     }

          		
	}
}