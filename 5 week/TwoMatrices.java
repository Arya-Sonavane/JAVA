import java.util.Scanner;
public class TwoMatrices
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	
	System.out.println("enter value for a:");
	for(int i=0; i<a.length; i++)
	{
	   for(int j=0; j<a[i].length;j++)
	    {
		a[i][j]=sc.nextInt();
	    }
	}

	System.out.println("enter value for b:");
	for(int i=0; i<b.length; i++)
	{
	   for(int j=0; j<b[i].length;j++)
	    {
		b[i][j]=sc.nextInt();
	    }
	}

	for(int i=0; i<a.length; i++)
	{
	   for(int j=0; j<a[i].length;j++)
	    {
		a[i][j]=a[i][j]+b[i][j];
	    }
	}

	System.out.println("\nAddition is");
	for(int i=0; i<b.length; i++)
	{
	   for(int j=0; j<b[i].length;j++)
	    {
		System.out.printf("%d\t",a[i][j]);
	    }
	}


   }
}