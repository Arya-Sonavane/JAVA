import java.util.Scanner;
public class LargestElement
{
   public static void main(String args[])
   {
	int a[]={3, 5, 3, 2, 1, 7, 8, 9 , 10};
	
	int i;
	
	System.out.println("Dispaly  Array ");
	for(i=0; i<a.length;i++)
	{
	  System.out.printf("%d\t", a[i]);
	}
	
	for(i=0; i<a.length; i++)
	{
	   int max=i;
	   for(int j=i+1; j<a.length; j++)
	   {
	     if(a[j]>a[max])
	      {
		max=j;
	      }
	   }
	   if(max!=i)
	   {
		int temp=a[i];
		a[i]=a[max];
		a[max]=temp;
	   }
	}
	System.out.println("lnSecond Largest Number is :   "+a[1]);

   }
}