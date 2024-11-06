import java.util.Scanner;
public class VowelConsonants
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		String value=sc.next();
		
		char ch=value.charAt(0);
		
		String result= ch=='a' || ch== 'e' || ch=='i' ||  ch=='o' || ch=='u' ? "It is vowel" :"It is Consonantss";
		System.out.println(result);
	}
}