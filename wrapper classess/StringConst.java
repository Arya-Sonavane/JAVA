//example with string constatnt pool

// if string initialize without new keyword then if we having multiple strings then also string create single object in string constant pool....

public class StringConst
{
  public static void main(String x[])
  {
     String s="Very";//string intializtion without using new
     String s1="Very";

    System.out.println("Hashcode  of s "+System.identityHashCode(s));
	System.out.println("Hashcode  of s1 "+System.identityHashCode(s1));

    

  } 
}