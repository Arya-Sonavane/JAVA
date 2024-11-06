public class BasicSalary
{
	public static void main(String args[])
	{
		int bs=Integer.parseInt(args[0]);
		int da=bs*30/100;
		int hra=bs*30/100;
		int total=bs+da+hra;
		System.out.println("Basic salary of employee is"+total);	
	}
}