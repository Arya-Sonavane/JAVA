import java.util.Scanner;

public class Alphabate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		String value =sc.next();
		
		char ch=value.charAt(0);
             
        	String result = ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ? " is an alphabet." : " is not an alphabet.";
       		System.out.println(ch + result);
	}
}