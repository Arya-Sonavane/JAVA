import java.util.Scanner;
public class CheckDigitOrChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		String value=sc.next();
		
		char ch=value.charAt(0);
		
		String result= ch>='a' && ch<='z' ? "this is alphabate" :(ch>= '0' && ch <='9' ? "It is Number" : "It is Special character");
		System.out.println(result);
	
	}

}