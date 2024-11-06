// write a program for handle null pointer exception


public class NullPointer
{
  static int a[];
  public static void main(String x[])
  {
     try
     {
      a[0]=100;
      System.out.println(a);
     }
     catch(NullPointerException ex)
     {
     System.out.println("Error is"+ex);

     System.out.println("allocate memory");
     

     }
  }
}

