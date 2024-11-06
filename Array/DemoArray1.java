import java.util.Scanner;
public class DemoArray1
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	 
	    int a[];//declaration of array
	    a=new int[5];  //memory allocation
	    System.out.println("Enter data in array");

	      for(int i=0; i<a.length; i++)
	      {
		a[i]=sc.nextInt();
	      }

	      for(int i=0; i<a.length; i++)
	      {
		System.out.printf("%d\t", a[i]);
	      }
	}
}

