class ABC
{
   ABC()
   {
      System.out.println("No");
   }
}
class PQR extends ABC
{
  PQR()
  {
    System.out.println("Yes");
  }
}
public class super
{
    public static void main(String arg[])
    {
       PQR t=new PQR();
    }
}