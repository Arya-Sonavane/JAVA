import java.util.Scanner;
public class MenuDriven3
{

    public static void main(String args[])
     {
	int a , b , c;
	String s ,s1 , result;
	Scanner sc=new Scanner(System.in);
	System.out.println("1.check number divisible by 5 and 11 or not");
	System.out.println("2.check triangle is Equilateral , isoscale or scalene");
	System.out.println("3. check year is leap or not.");
	System.out.println("4. alphabate vowel or consonant");
	System.out.println("5. check it is alphabate , digit or special character");
	System.out.println("Enter choice");
	int choice=sc.nextInt();

	switch(choice)
	{
		case 1: System.out.println("enter number");
			a=sc.nextInt();
			result= a%5==0 && a%11==0 ? "Number is Divisible by 5 and 11": "Number not divisible";
			System.out.println(result);
			break;

		case 2: System.out.println("enter three value for triangle sides:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			result=(a==b)&&(b==c)&&(a==c) ? "Triangle is Equilateral" :
				a==b || a==c || b==c ? "Triangle is Isoscale" : "Triangle is Scalene"; 
			System.out.println(result);
			break;
		
		case 3:
			System.out.println("enter year");
			a=sc.nextInt();
			result=a%4==0?"this is leap year":"this is not leap year";
			System.out.println(result);
			break;

		case 4:
			System.out.println("enter alphabate");
			s=sc.next();
			char ch=s.charAt(0);
			result=ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' ? "it is vowel":"it is consonant";
			System.out.println(result);
			break;

		case 5:
			System.out.println("enter value");
			s1=sc.next();
			char d=s1.charAt(0);
			result = (d>='a') && (d<='z') ?"it is alphabate":((d>='0') && (d<='9') ? "this is digit" : "it is a special 				character");
			System.out.println(result);
			break;
	}
   }
}