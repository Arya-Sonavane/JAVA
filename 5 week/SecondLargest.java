import java.util.Scanner;
public class SecondLargest
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
	  int max=i;
	  for(int j=i+1; j<a.length; j++)
	  {
	    if(a[j]>a[max])
	    { max=j; }
	  }
	  if(max!=i)
	  {
		int temp=a[i];
		a[i]=a[max];
		a[max]=temp;
	  }
	}
	System.out.println("\nsecond largest number is: "+a[1]);
	
   }
}