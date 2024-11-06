public class Test1
{
	public static void main(String args[])
	{
		int a=10 , b=20 , c;
		c= ++a || b++;

		System.out.printf("A=%d\tB=%d\tC=%d\n", a , b ,c);
		
	}
}