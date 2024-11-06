import java.util.Scanner;
public class PrimeFactorsOfNumber
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
       int i=1;
  	
	do
	{
	  int div=2 ,  cnt=0;
	  	 do
	  	  {
	  	    if(i%div==0){cnt++;}
		    div++;
	 	  }
	 	  while(div<=no);
	
	  System.out.print(" "+(cnt==1 ? (no%i==0) ? i : " " : ""));
	  i++;
	}
	while(i<no);
    }
}