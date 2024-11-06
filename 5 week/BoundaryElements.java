import java.util.Scanner;
public class BoundaryElements
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[3][3];
	
	System.out.println("enter values");
	for(int i=0; i<a.length;i++)
	{
	  for(int j=0; j<a[i].length; j++)
	  {
	    a[i][j]=sc.nextInt();
	  }
	}
	System.out.println("Ouput:");
	for(int i=0; i<a.length;i++)
	{
	  
	  for(int j=0; j<a[i].length; j++)
	  {  
	    if(i==1&&j==1)
	    {
		System.out.print("   ");
	    }
	    else
	    {
	      System.out.print(a[i][j]+"  ");
            }
	  }
	  System.out.println();
	 
	}

	
  }
}