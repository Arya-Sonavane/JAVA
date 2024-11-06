import java.util.Scanner;
public class StrongNumberList
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter number");
	   int num=sc.nextInt();
	   int i=1;
	   while(i<=num)
	    {
	       int sum=0, temp=i;
	   	while(temp!=0)
	   	{
			int rem=temp%10;
			int j=1 , a=1;
			while(j<=rem)
			{
			   a=a*j;
			   j++;
			}
			sum=sum+a;
	      	        temp/=10;
          	 }	
		
	      System.out.print(i==sum? i+" " :"");
		i++;
	    }
        }
}