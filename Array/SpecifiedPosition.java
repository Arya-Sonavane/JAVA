import java.util.Scanner;
public class SpecifiedPosition
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[6];
	int i;
	System.out.println("enter value");
	for(i=0; i<a.length-1; i++)
	{
	  a[i]=sc.nextInt();
	}
	
	System.out.println("display values before insert ");
	 for( i=0; i<a.length-1;i++)
	 {
	    System.out.printf("%d\t", a[i] );	
	 }
	 
	System.out.println("\nenter no");
	int  value=sc.nextInt();
	System.out.println("enter index");
	int  index=sc.nextInt();

	for(i=a.length-2; i>=index; i--)
	{
	   a[i+1]=a[i];
	}
	a[index]=value;
	System.out.println("display values after insert ");
	 for( i=0; i<a.length;i++)
	 {
	    System.out.printf("%d\t", a[i] );	
	 }
   }
}