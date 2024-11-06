import java.util.Scanner;
public class DuckNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no, cnt=0;
		System.out.println("enter number");
		no=sc.nextInt();
		
		while(no!=0)
		{
		     int rem=no%10;
		     if(rem==0){cnt++;}
		     no=no/10;
		     
		}
	        String result =cnt>0 ? "it is a duck number " :"it is a not duck number";
		System.out.println(result);
	}
	
}