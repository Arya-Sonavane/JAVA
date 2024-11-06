import java.util.Scanner;
public class UniqueElements
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   int a[]=new int[5];
	   
	   System.out.println("enter elements");
	   for(int i=0; i<a.length; i++)
	    {
		a[i]=sc.nextInt();
	    }
	
	   System.out.println("Unique elements");
	   for(int i=0;  i<a.length;i++)
	    {
		int cnt=0;
		for(int j=i+1; j<a.length;j++)
		{
		  if(a[i]==a[j])
		    {
			a[j]=0;
			cnt++;
		    }
		}
              a[i]=(cnt>0)? a[i]=0 : a[i];
	      System.out.print((a[i]>0) ?  a[i]+"\t" : "");
	    }
	}
}