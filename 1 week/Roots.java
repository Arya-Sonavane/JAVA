import java.util.Scanner;
import java.lang.Math;
public class Roots
{
	public static void main(String args[])
	{
		int a , b ,c ;
		double root1 , root2=0;
							
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter value for a: ");
		a=sc.nextInt();

		System.out.printf("Enter value for b: ");
		b=sc.nextInt();
		
		System.out.printf("Enter value for c: ");
		c=sc.nextInt();

		double d = b*b-4*a*c;
		System.out.println("dddddddddddddddddddddddddddddd"+d);
		
		if(d>0)
		{
			System.out.println("Roots are real and diffrent ");

       			root1 = (-b + Math.sqrt(d)) / (2 * a);
    			root2 = (-b - Math.sqrt(d)) / (2 * a);

   			 System.out.printf("Root1 is %f\n", root1);
   			 System.out.printf("Root2 is %f\n", root2);

		}
		else if(d==0)
		{
			
			System.out.println("Roots are real and equal");
			
			root1=-b/2*a;
		
			root1=-b/2*a;

			System.out.printf("Root1 is %f\n", root1);
			System.out.printf("Root2 is %f\n", root2);

		}
		else
		{
			System.out.println("Roots are Immaginary");
			
		}
	
	}
}