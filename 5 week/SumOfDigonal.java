import java.util.Scanner;
public class SumOfDigonal
{
     public static void main(String args[])
     {
	int b=3 , c=0, first=0 , second=0 ,sum=0;

	Scanner sc=new Scanner(System.in);
	int a[][]=new int[4][4];
	
	System.out.println("enter values");
	for(int i=0; i<a.length;i++)
	{
	  for(int j=0; j<a[i].length; j++)
	  {
	    a[i][j]=sc.nextInt();
	  }
	}
	 
	for(int i=0; i<a.length;i++)
	{
	   System.out.print("\n{ ");
	  for(int j=0; j<a[i].length; j++)
	  {
	    System.out.print(a[i][j]+"  ");
	  }
	  System.out.print("}");
	}
	
	for(int i=0; i<a.length;i++)
	{
	  for(int j=0; j<a[i].length; j++)
	  {
	      if(i==j)
	      {
		first+=a[i][j];		
	      }
	     else if(j==b)
	     {
	       second+=a[i][j];
	       b--;
	     }
	  }
	}

	System.out.println("\n\nSum of Digonal is:"+(sum=first+second));
     }
}