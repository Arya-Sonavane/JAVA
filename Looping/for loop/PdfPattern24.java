public class PdfPattern24 {
    public static void main(String args[]) {
          int no1=1 , no2=1;

	   for(int i=1; i<=8; i++)
	    {
		
		
		for(int j=1; j<=no1; j++)
		{
      		   if(no1>=j && i<=4 )
		   {
		      System.out.print( (j%2==0) ? "*"  :  no2++ );
		   }
		   else if ( j<=12-i && i>=5)
		   {
		      no2=(i==5 && j==1)? 7 :(i==6 && j==1)? 4 
                          :(i==7 && j==1)? 2 :(i==8)? 1 :no2;

		    System.out.print( (j%2==0) ? "*" :no2++);
		   }
		}
		no1=(no1<7 && i<5) ? no1+=2 :(i>=5) ? no1=no1-2 :no1;
		System.out.println();
		}
    }
}


