// we want to convert int primitive value in to string, float, double etc reference value

public class PrimitiveToReference
{
  public static void main(String x[])
  {
    int a=1345666;
    
    Float b=Float.valueOf(a);
    System.out.println("value of b is"+b);
  }
}