import java.util.Scanner;
public class SpecifiedIndex
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   int a[]=new int[6];
	   
	     System.out.println("enter values ");

	   for(int i=0; i<a.length-1;i++)
	   {
		a[i]=sc.nextInt();
	   }
      	
	    System.out.println("Before Shifting ");
	   for(int i=0; i<a.length;i++)
	   {
		System.out.printf("%d\t",a[i]);
	   }
	   
	   System.out.println("enter  index and values ");
	   int index=sc.nextInt();
	   int value=sc.nextInt();

	   for(int i=(a.length-2); i>=index; i--)
	    {
		a[i+1]=a[i];
	    }
	    a[index]=value;
	
	     System.out.println("after shifting ");
	    for(int i=0; i<a.length;i++)
	   {
		System.out.printf("%d\t",a[i]);
	   }
	   
	   
	}
}