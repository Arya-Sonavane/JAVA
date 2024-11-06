public class OddNumbers
{
    public static void main(String args[])
    {
	int i=1;
	do
	{
	   System.out.print(i%2!=0?i:"\t");
	   i++;
	}
	while(i<=100);
    }
}