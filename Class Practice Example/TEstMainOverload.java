public class TestMainOverload
{
	public static void main(String args[])
	{
		System.out.println("This is real Main method");
	}
	public static void main(int args[]){
	System.out.println("This is int argument main method");
	
     	}
	public static void main(String args[], int a[])
	{
		System.out.println("This is two arguments method");
	}
}