// covert string value to primitive value in wrapper

public class StringToPrimitive
{
  public static void main(String x[])
  {
    String s="1234555";

    int a=Integer.parseInt(s); 
    Float b=Float.parseFloat(s);
    Double d=Double.parseDouble(s); 
    Long l=Long.parseLong(s);

    System.out.println("value of a is"+a);
    System.out.println("value of b is"+b);
    System.out.println("value of d is"+d);
    System.out.println("value of l is"+l);
    
  }
}