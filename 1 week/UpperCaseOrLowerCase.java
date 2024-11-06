import java.util.Scanner;

public class UpperCaseOrLowerCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value");
		String value=sc.next();
		char ch=value.charAt(0);
		String result=  ch>='a' && ch<='z' ? "It is Lower Case letter " : (ch>='A' &&ch<='Z' ? "Its Upper Case letter":"not a char");
		System.out.println(result);
	}
}