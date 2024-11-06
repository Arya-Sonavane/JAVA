public class AreaOfCircle
{
	public static void main(String args[])
	{
		float radious=Float.parseFloat(args[0]);
		float area=radious* radious*3.14f;

		System.out.println("Area of circle is "+area);
	}
}