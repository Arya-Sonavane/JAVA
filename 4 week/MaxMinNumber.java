import java.util.Scanner;
public class MaxMinNumber
{
    public static void main(String args[])
    {
	int max=0 , min=0;
	Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
	System.out.print("enter values");
	
        for(int i=0; i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	
	
	for(int i=0; i<a.length; i++)
	{
	   if(a[i]>max)
	     {
		max=a[i];
	     }
	   else 
	    {
		min=a[i];
	    }
	}
	System.out.printf("Maximum num is : %d\t", max);
	System.out.printf("Minimum num is : %d\t", min);
	
    }
}