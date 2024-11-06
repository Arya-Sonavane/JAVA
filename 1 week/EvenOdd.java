public class EvenOdd
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);

		String result=num%2==0?"Even":"Odd";
	 	
		System.out.println("Result is:"+result);
	}

}
