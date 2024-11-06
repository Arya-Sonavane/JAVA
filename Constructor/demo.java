/*
1)Constructor is special function in java whoes name is same as class name
2)Use of constructor is to initialize instance variables.
3)Constructor does not have return type.
*/

class ABC
{
   int a;
   int b;
   ABC() //We can not create private cons.
   {
     System.out.println("Hii");
   }
   ABC(int a)
   {
     System.out.println("Yes");
   }
}
public class demo
{
    public static void main(String arg[])
    {
       ABC ref=new ABC();//default
       ABC ref1=new ABC();//paraetrised 
       
    }
}