import java.util.Scanner;
public class ShowElements
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
 	   int a[]=new int[5];	
	   int sum=0;
	   System.out.println("enter values");
	   for(int i=0; i<a.length;i++)
	    {
		a[i]=sc.nextInt();
	    }
	    
	    System.out.println("display values");
	   for(int i=0; i<a.length;i++)
	    {
		sum+=a[i];		
	    }
	     System.out.println("Sum of  values : "+sum);

	}
}