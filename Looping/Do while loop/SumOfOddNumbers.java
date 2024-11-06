public class SumOfOddNumbers
{
    public static void main(String args[])
    {
	int i=1 , sum=0;
	do
	{
	   sum=(i%2!=0)? sum+=i : sum;
	   i++;
	}
	while(i<=100);
	System.out.println(sum);
    }
}