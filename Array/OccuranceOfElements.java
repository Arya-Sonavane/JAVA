import java.util.Scanner;
public class OccuranceOfElements
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[6];
	int b[]=new int[a.length];
	
	System.out.print("enter elements");
	for(int i=0; i<a.length; i++)
	{
	   a[i]=sc.nextInt();
	   b[i]=a[i];
	}
	
	for(int i=0; i<a.length; i++)
	{
	  int cnt=0;
	  for(int j=0; j<b.length ; j++ )
	   {
		if(a[i]==b[j])
		  {
		     cnt++;
		     b[j]=0;
		  }
	   }
	  System.out.print("\n"+((cnt>0)?a[i]+"  -  "+cnt:"\t"));
	}

	
    }
}