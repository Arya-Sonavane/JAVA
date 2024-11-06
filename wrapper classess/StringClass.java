public class Class
{
  public static void main(string x[])
  {
     String s=new String("abc");
     String s1=new String("abc");

     System.out.println("hashcade of s"+System.identityHashCode(s));
     System.out.println("hashcade of s1"+System.identityHashCode(s1));
     
     
  }
}