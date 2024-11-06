

class ABC
{
   ABC()
   {
    this(10);
    System.out.println("Default const.");
   }
   ABC(int a)
   {
     this(5.5f);
     System.out.println(a);
   }
   ABC(float b)
   {
     System.out.println(b);
   }
}
public class Inheritace
{
    public static void main(String arg[])
    {
       ABC ref=new ABC();
    }
}