import java.util.Scanner;
public class DeleteElement
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int a[]={5, 7, 3, 2, 6, 9};
	int i;
	System.out.println("enter index");
	int index=sc.nextInt();
	
	System.out.println("Dispaly  Array ");
	for(i=0; i<a.length;i++)
	{
	  System.out.printf("%d\t", a[i]);
	}

	for(i=0; i<a.length;i++)
	{
	  if(index==i)
	   a[i]=0;
	}
	
	System.out.println("\nDispaly  Array After Delete Element ");
	for(i=0; i<a.length;i++)
	{
	  if(a[i]>0)
	  System.out.printf("%d\t", a[i]);
	}
	
  }
	
}