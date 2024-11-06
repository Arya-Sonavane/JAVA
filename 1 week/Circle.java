public class Circle
{
	public static void main(String args[])
	{
		float radius=Float.parseFloat(args[0]);
		
		float area= radius * radius *3.14f;
		float diameter = 2*radius;
		float c= 2 * 3.14f * radius;
		
		System.out.println("Area of Circle is : "+area);
		System.out.println("Diameter of Circle is : "+diameter);
		System.out.println("Circumference of Circle is : "+c);
		

	}
}