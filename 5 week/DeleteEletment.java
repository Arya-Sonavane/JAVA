import java.util.Scanner;
public class DeleteEletment
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	
	System.out.print("enter value:");
	for(int i=0;i<(a.length);i++)
	{  a[i]=sc.nextInt();
	}

	System.out.println("\nBefore Delet elements");
	 for(int i=0; i<a.length; i++)
	   {
	     System.out.printf("%d\t", a[i]);
	   }

	System.out.print("\nenter value for no:");
	int no=sc.nextInt();

	for(int i=0; i<a.length;i++)
	{
	   if(a[i]==no)
	    {
		a[i]=0;
	    }
	}
     
         System.out.println("\nafter Delete element");
	   for(int i=0; i<a.length; i++)
	    {
		System.out.print((a[i]>0)? a[i]+"\t" : "");
	    }


  }
}