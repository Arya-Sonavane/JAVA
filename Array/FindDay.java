import java.util.Scanner;
public class FindDay
{
	public static void main(String arts[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for year month and day");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		
		int LastDigit=year-2000;
        	int FirstDigt=year/100;
        	int s=day+((13*month+1)/5)+LastDigit+LastDigit/4+FirstDigt/4-2*FirstDigt;
                s=s%7;
         
     	       String v="";
               switch(s)
        	    {
         	       case 0:v= "MONDAY";
        	                break;
                            
       	               case 1:v= "TUESDAY";
         	               break;
          	       case 2: v="WEDNESDAY";
          	              break;
           	       case 3:    v="THURSDAY";
           	             break;
                        
            	       case 4: v="FRIDAY";
            	               break;
            	       case 5: v="SATURDAY";
                	        break;
               	       case 6: v="SUNDAY";
               		         break;
               	       default:
               		         System.out.println("doesnt valid date");
               		         break;
            }

		System.out.println(v);
	}

}