class A extends Thread
{     public void run()
      {
	  try{
	    for(int i=1; i<=5; i++)
	    { System.out.printf("First Thread = %d\n",i);
		Thread.sleep(1000);
	    } 
	  }
	  catch(Exception ex)
	  { System.out.println("Error is "+ex);
	  }
      }  
}
class B extends Thread
{     public void run()
      {
	  try{
	    for(int i=1; i<=50; i++)
	    { System.out.printf("Second Thread = %d\n",i);
		Thread.sleep(1000);
	    } 
	  }
	  catch(Exception ex)
	  { System.out.println("Error is "+ex);
	  }
      }  

}
public class ProcessApp
{
     public static void main(String x[])throws Exception
     {	
       
       A a1 = new A();
	a1.start();
   	B b1 = new B();
	b1.start();
     }
}
