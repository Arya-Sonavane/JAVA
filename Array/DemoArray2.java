public class DemoArray2
{
    public static void main(String args[])
    {
	int a[]=new int[]{10, 20 , 30 , 40 , 50};
	int b[];
	b=a;
	b[3]=1000;
	
	for(int i=0; i<a.length; i++)
	{
	   System.out.printf("%d\t", a[i]);
	}
    }
}