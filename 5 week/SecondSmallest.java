import java.util.Scanner;
public class SecondSmallest
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	
	System.out.println("enter value");
	for(int i=0 ; i<a.length; i++)
	{
	  a[i]=sc.nextInt();
	}
	
	System.out.println("\nElements :");
	for(int i=0; i<a.length; i++)
	{
	 System.out.printf("%d\t", a[i]);
	}
	for(int i=0; i<a.length; i++)
	{
	  int min=i;
	  for(int j=i+1; j<a.length; j++)
	  {
	    if(a[j]<a[min])
	    { min=j; }
	  }
	  if(min!=i)
	  {
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	  }
	}
	System.out.println("\nsecond largest number is: "+a[1]);
	
   }
}