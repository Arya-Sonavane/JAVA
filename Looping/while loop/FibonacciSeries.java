import java.util.Scanner;
public class FibonacciSeries
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter number");
	 int no=sc.nextInt();
	 int a=0, b=1;
	 System.out.print(a +" "+b);

	 int i=1 , sum=0;
	 while(i<no)
	 {
		sum=a+b;
		a=b;
		b=sum;
		i++;
	     System.out.print(" "+sum+" ");
		
	 }
	}
}