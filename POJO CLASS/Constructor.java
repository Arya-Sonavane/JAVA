/*
1)Constructor is special function in java whoes name is same as class name
2)Use of constructor is to initialize instance variables.
3)Constructor does not have return type.
*/

class ABC
{
   int a;
   int b;
   ABC()
   {
     System.out.println("Hii");
   }
   ABC(int a)
   {
     System.out.println("Yes");
   }
}
public class Constructor
{
    public static void main(String arg[])
    {
       ABC ref=new ABC();
       ABC ref1=new ABC(10);
    }
}