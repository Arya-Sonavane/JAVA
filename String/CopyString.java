public class CopyString
{
  public static void main(String x[])
  {
    String s= "Arya Sonavane";
    char a[]=s.toCharArray();

    for(int i=0; i<a.length; i++)
    {
       System.out.println(a[i]);
    }

     String copy=new String(a);

     System.out.println(copy);

  }
}