// methods of string class

public class MethodOfString1
{
  public static void main(String x[])throws Exception
  {
     String s="Arya Sonavane";
     int l=s.length();//method of string to return the length

     for(int i=0; i<l; i++)
     {
       char ch=s.charAt(i);// return character by using its index
       
       System.out.printf("%d---->%c\n",i,ch);
     }
  }

}