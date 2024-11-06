public class MajorityArray
{
    public static void main(String args[])
    {
	int a[]={3, 4, 9, 4 , 8, 7, 4};
	for(int i=0; i<a.length; i++)
	{
	   int cnt=1;
	   for(int j=i+1; j<a.length;j++)
	   	if(a[i] == a[j])  cnt++;

	   System.out.print((cnt>a.length/2) ? a[i] :"");
	}
    }
}