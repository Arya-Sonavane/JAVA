//concatenate two strings

public class Concate
{
  public static void main(String x[])
  {
    String s1="Arya";
    String s2="Sonavane";

    char a[]=s1.toCharArray(); // Arya

    char b[]=s2.toCharArray(); //Sonavane

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