import java.util.Scanner;

public class StudentInfo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id:");
		int Id=sc.nextInt();

		System.out.println("Enter Student name:");
		String name=sc.next();
		
		System.out.println("Enter Student Percentage:");
		int perc=sc.nextInt();

		System.out.printf("Student Id is %d\n",Id);
		System.out.printf("Student Name is %s\n",name);
		System.out.printf("Percentage are: %d\n",perc);
		
	}
}