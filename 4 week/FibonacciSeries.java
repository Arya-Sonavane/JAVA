import java.util.Scanner;
public class FibonacciSeries
{
    public static void main(String args[])
    {

	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();

	int a=0, b=1 , sum=0 , i=1;
	System.out.print(a+" "+b+" ");

       
	
	do
	{
           sum=a+b;
	   a=b;
	   b=sum;
	   System.out.print(sum+" ");
	   i++;
	}while(i<no);
    }
}