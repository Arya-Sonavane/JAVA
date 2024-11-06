import java.util.Scanner;
public class CheckFrequencyOfNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		int c0=0, c1=0, c2=0 , c3=0 , c4=0 ,c5=0 , c6=0 , c7=0 ,c8=0 ,c9=0;
		while(no!=0)
		{
			int rem=no%10;
		        switch(rem)
			{
				case 0:  
					c0++;
					break;		
				case 1:  
					c1++;
					break;
					
				case 2:  
					c2++;
					break;
				case 3:  
					c3++;
					break;
				case 4:  
					c4++;
					break;
				case 5:  
					c5++;
					break;
				case 6:  
					c6++;
					break;
				case 7:  
					c7++;
					break;
				case 8:  
					c8++;
					break;
				case 9:  
					c9++;
					break;
				default:
					System.out.println("");
				
		         }

			no/=10;
					
		
			if(c0>0)
			{
				System.out.println("Frequency of 0 : "+c0);
			}
			else if(c1>0)
			{
				System.out.println("Frequency of 1 : "+c1);
			}
			else if(c2>0)
			{
				System.out.println("Frequency of 2 : "+c2);
			}
			else if(c3>0)
			{
				System.out.println("Frequency of 3 : "+c3);
			}
			else if(c4>0)
			{
				System.out.println("Frequency of 4 : "+c4);
			}
			else if(c5>0)
			{
				System.out.println("Frequency of 5 : "+c5);
			}
			else if(c6>0)
			{
				System.out.println("Frequency of 6 : "+c6);
			}
			else if(c7>0)
			{
				System.out.println("Frequency of 7 : "+c7);
			}
			else if(c8>0)
			{
				System.out.println("Frequency of 8 : "+c8);
			}
			else if(c9>0)
			{
				System.out.println("Frequency of 9 : "+c9);
			}
		}
	}
}