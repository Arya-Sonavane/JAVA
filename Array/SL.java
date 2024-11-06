import java.util.Scanner;
public class SL
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[6];
	int i , smax=0;
	System.out.println("enter values");
	 
	for(i=0;i<a.length;i++) a[i]=sc.nextInt();
	for(i=0;i<a.length;i++) System.out.print(a[i]+"\t");
   
	
	for(i=0; i<a.length; i++)
	{
	  int max=i;
	  for(int j=i+1; j<a.length; j++)
	  {
	     if(a[j]>a[max])
	      {
		max=j;
	      }
	      else if(a[smax]<a[j])
	      {
		smax=j;
	      }
	  }
	   if(i!=max)
	   {
	     int temp=a[i];
	         a[i]=a[max];
		 a[max]=temp;
	   }
	}
	
	System.out.println("Second largest: "+smax);
	
  }
}