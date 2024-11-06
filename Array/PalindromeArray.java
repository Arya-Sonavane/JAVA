import java.util.Scanner;
public class PalindromeArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		
		System.out.println("enter value");
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before Reverse ");
	   	for(int i=0; i<a.length;i++)
	   	{
			System.out.printf("%d\t",a[i]);
	   	}

		for(int i=0; i<b.length;i++)
		{
			b[i]=a[i];
		}
		
		int mid=a.length/2;
		int end=a.length-1;
		
		for(int i=0; i<mid;i++)
		{
		   int temp=a[i];
		   a[i]=a[end];
		   a[end]=temp;
		   end--;
		}
		System.out.println("After Reverse ");
	  	 for(int i=0; i<a.length;i++)
	  	 {
			System.out.printf("%d\t",a[i]);
	  	 }
		Boolean flag=true;
		for(int i=0; i<a.length;i++)
		{
		   if(a[i]!=b[i])
	    	     {
			flag=false;
			break;
	      	     }
		}
	
		System.out.println((flag)? "Palindrome Array" : "Not Palindrome Array");
		

	}
}