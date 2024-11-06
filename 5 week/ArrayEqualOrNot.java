import java.util.Scanner;
public class ArrayEqualOrNot
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	 int a[]=new int[3];
	 int b[]=new int[2];
	System.out.println("enter value for a");
	for(int i=0 ; i<a.length; i++)
	{
	  a[i]=sc.nextInt();
	}
	System.out.println("enter value for b");
	for(int i=0 ; i<b.length; i++)
	{
	  b[i]=sc.nextInt();
	}
	Boolean flag=true;
         
	if(a.length==b.length)
	{
	 for(int i=0; i<a.length; i++)
	  {
	    if(a[i]!=b[i])
	     {
		flag=false;
		break;
	     }
	  }
	  System.out.println((flag)?"Yes": "No");
	}
	else
	{
	 System.out.println("NO");
	}
	



	
   }
}