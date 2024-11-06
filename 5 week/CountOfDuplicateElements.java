/*
 3 3 5 2 2 3 

 output :
   occurance of 3 is : 3
   occurance of 5 is : 1
   occurance of 2 is : 2
  Total number duplicates are: 2	
*/

import java.util.Scanner;
public class  CountOfDuplicateElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		int b[]=new int[6];
		
		System.out.print("enter elements");
		for(int i=0; i<a.length; i++)
		{
		    a[i]=sc.nextInt();
		    b[i]=a[i];
		}

		int cnt , total=0;

		for(int i=0;i<a.length;i++)
		{
		   cnt=0;
		    for(int j=0; j<b.length;j++)
		     {
			if(a[i]==b[j] )
			{
			  cnt++;
			  b[j]=0;
			}
		     }
		    if(cnt>0)
		    System.out.println(" occurance of "+a[i]+ "  is : "+cnt );

		    if(cnt>1)total++;
		}
	       System.out.println("Total number of Duplicates are: "+total);
	
		
	}
}