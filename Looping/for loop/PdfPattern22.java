public class PdfPattern22
{
   public static void main(String x[])
   {
	int no=3;
      for(int i=1; i<=7; i++)
      {
	
	 for(int j=1; j<=4;j++)
	 {
	    if((i>=j && i<=4) || (j<=8-i && i>=4))
	    { System.out.print(no);
	    }
	    else{
 	      System.out.printf(" ");
	      
	   }
	 }
	 	  	
         System.out.printf("\n");
	   if(i<4)
	     no++;
	   else
	     no--;
      }
   }
}
