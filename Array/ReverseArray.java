public class ReverseArray
{
    public static void main(String arg[])
    {
	int a[]={10, 20 , 30 ,40 ,50};

	int end=a.length-1;
	int mid=a.length/2;
	
	System.out.println("display values before Reverse ");
	 for(int i=0; i<a.length;i++)
	 {
	    System.out.printf("%d\t", a[i] );	
	 }

	for(int i=0; i<mid; i++)
	{
	  int temp=a[i];
	  a[i]=a[end];
	  a[end]=temp;
	  end--;
	}
	
	System.out.println("\ndisplay values after insert ");
	 for(int  i=0; i<a.length;i++)
	 {
	    System.out.printf("%d\t", a[i] );	
	 }

    }
}