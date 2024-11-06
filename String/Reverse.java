//reverse of a string

public class Reverse
{
  public static void main(String x[])
  {
     String s1="Arya";

     String result="";

     char ch;
     
 
     for(int i=0; i<s1.length(); i++)
     {
       ch=s1.charAt(i);
       result=ch+result;
     }
    System.out.println("reverse string is=" +result);
  }
}