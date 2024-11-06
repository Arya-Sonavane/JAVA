import java.util.Scanner;
public class EvenOddNumber
{
    public static void main(String args[])
    {
	
	Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
	System.out.print("enter values");
	
        for(int i=0; i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	
	
	for(int i=0; i<a.length; i++)
	{
	   if(a[i]%2==0)
	     {
		System.out.printf("Even no: %d\t",a[i]);
	     }
	   else 
	    {
		System.out.printf(" Odd no: %d\t",a[i]);
	    }
	}
	
	
    }
}