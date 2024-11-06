import java.util.Scanner;
public class CommonElements
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	String [] a= new String[5];
	String [] b=new String[4];
	
	System.out.println("enter value for a");
	for(int i=0; i<a.length;i++)
	{
	  a[i]=sc.next();
	}
	System.out.println("enter value for b");
	for(int i=0; i<b.length;i++)
	{
	  b[i]=sc.next();
	}
	
	System.out.println("\ndisplay common string");
	for(int i=0; i<a.length;i++)
	{
	   
	    for(int j=0; j<b.length;j++)
	    {
			   
		if(a[i].equals(b[j]))
	        {
    		   System.out.print(a[i]+" ");
		}
	
	    }
	}


    }
}