public class PdfPattern25 {
    public static void main(String args[]) {
        int k = 1;
       
        for (int i = 1; i <= 7; i++) {
              
		int no=1; 
		        
            for (int j = 1; j <= k; j++) 
	    {
		
                if(j==1 || j==k )
		{
		   System.out.print("*");
		}
		else
		{
		     System.out.print(( j>=i && i<=4 ) || (j==3 && i>4)? no-- : no++);
		}
            }
	     if(i < 4){ k+=2 ;}else if(k>4 || k<7){ k-=2;}
	   
            System.out.println();
        }
    }
}
