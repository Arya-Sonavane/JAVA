import java.util.Scanner;
public class GS
{
public static void main(String args[])
{
	int basicSalary , da , hra , GS;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter basic salaryl:");
	basicSalary=sc.nextInt();
	System.out.println("Basic Salary: "+basicSalary);

	if(basicSalary<=10000)
	{
		da=basicSalary*80/100;
		hra=basicSalary*20/100;
		GS=basicSalary+da+hra;
		System.out.println("Gross Salary: " +GS);
	}
	else if(basicSalary<=20000)
	{
		da=basicSalary*90/100;
		hra=basicSalary*25/100;
		GS=basicSalary+da+hra;
		System.out.println("Gross Salary: " +GS);
	}
	else if(basicSalary>20000)
	{
		da=basicSalary*95/100;
		hra=basicSalary*30/100;
		GS=basicSalary+da+hra;
		System.out.println("Gross Salary: " +GS);
	}
	

}
}