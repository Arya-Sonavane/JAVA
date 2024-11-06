import java.util.Scanner;
public class InsertElement
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[6];
	
	System.out.print("enter value:");
	for(int i=0;i<(a.length-1);i++)
	{  a[i]=sc.nextInt();
	}

	System.out.print("enter value for no:");
	int no=sc.nextInt();
	int index=0;
	  for(int i=0; i<a.length-1; i++ )
	  {
	     if(no<a[i])
             { 
	      index=i;
	       break;
	     }
	  }
	
	  for(int i=(a.length-2);i>=index;i--)
	  { 
	     a[i+1]=a[i];
	  }
	  a[index]=no;
	
	   System.out.println("\n after adding element");
	   for(int i=0; i<a.length; i++)
	    {
		System.out.printf("%d\t", a[i]);
	    }

	
   }
}