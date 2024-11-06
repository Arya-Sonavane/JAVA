import java.util.Scanner;
import java.lang.Math;
public class Roots
{
	public static void main(String args[])
	{
		int a , b , c;
		double  root1 , root2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for a , b , c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		double D=b*b-4*a*c;
		
		if(D>0)
		{
			System.out.println("roots are real and different");
			root1 = (-b + Math.sqrt(D)) / (2 * a);
    			root2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println(root1+" , "+root2);
		}
		else if(D==0)
		{
			System.out.println("roots are real and equal");
			root1=-b/2*a;
			System.out.println(root1);
		}
		else
		{
			System.out.println("Roots are immaginary");
		}

		
	}
}