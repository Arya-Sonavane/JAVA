import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String args[])
	{
		int no , rem,reverse=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		no=sc.nextInt();
		
		while(no!=0){
		  rem=no%10;
    		  reverse=reverse*10+rem;		
		  no=no/10;
		 }
		System.out.println(reverse);
	}
}