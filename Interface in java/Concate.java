// sum of digits in a string 


public class Concate
{
  public static void main(String x[])
  {
    String s1="10";
    String s2="53";

    char a[]=s1.toCharArray(); 

    char b[]=s2.toCharArray(); 

    char c[]=new char[a.length+b.length];//12

    int z=0;

    for(int i=0;i<a.length;i++)
    {
      c[z++]=a[i];//Arya
    }

    for(int i=0;i<b.length;i++)
    {
     c[z++]=b[i];
    }

    for(int i=0;i<c.length;i++)
    {
       System.out.print("\t"+c[i]);
    }

  }

}