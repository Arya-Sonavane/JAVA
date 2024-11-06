import java.util.Scanner;
public class Marks
{ 
  public static void main(String args[])
   {
	int sub1 , sub2, sub3, sub4, sub5, sub6 , avg ;
	int per;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter marks for sub1:");
	sub1=sc.nextInt();
	System.out.println("Enter marks for sub2:");
	sub2=sc.nextInt();
	System.out.println("Enter marks for sub3:");
	sub3=sc.nextInt();
	System.out.println("Enter marks for sub4:");
	sub4=sc.nextInt();
	System.out.println("Enter marks for sub5:");
	sub5=sc.nextInt();
	System.out.println("Enter marks for sub6:");
	sub6=sc.nextInt();

	int total=sub1+sub2+sub3+sub4+sub5+sub6;
	System.out.println("total : "+total);
	
	avg=total/6;
	per=(total*100)/600;

	System.out.println("Average Marks are: "+avg);
	System.out.println("Percentage is: "+per);

   }

}