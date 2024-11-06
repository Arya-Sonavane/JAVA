public class Test3
{
	public static void main(String args[])
	{
		int a, b, c;
		a=b=c=1;

		boolean d=(++a) >b  && (++b)>c || (++c==c);
		
		System.out.printf("A=%d\t B=%d\t C=%d\t D=%b",a, b, c,d);
	}
}