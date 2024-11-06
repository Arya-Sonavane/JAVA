  import java.util.Scanner;
public class DuckList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no,  j=1 ;
		System.out.println("enter number");
		no=sc.nextInt();
		
		while(j<=no)
		{
		 int cnt=0;
 		 int temp =j;
		 while(temp!=0)
		  {
		     int rem=temp%10;
		     if(rem==0){cnt++;}
		     temp=temp/10;	     
		  }
			
	          if(cnt>0)
		   {
			System.out.println(j);
		    
		   }
		 j++;
		}
	}
	
}