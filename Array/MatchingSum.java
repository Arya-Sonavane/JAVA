import java.util.Scanner;
public class MatchingSum
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int a[]={5, 10, 3, 30 , 6, 20};
	System.out.println("enter sum");
	int sum=sc.nextInt();
	//int csum=0;
	for(int i=0; i<a.length; i++)
	{
	  int csum=0;
	  for(int j=i+1; j<a.length; j++)
	  {
	    csum=a[i]+a[j];
	    System.out.print((sum==csum)?i+"  "+j:"");
	  }
	}


    }
}
