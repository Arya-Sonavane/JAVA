//find low frequency in a string 

public class lowFrequency
{
  public static void main(String x[])
  {
    String s1="aryaaaaaaaa";
    char arr[]=s1.toCharArray();
    char ch='a';
    
    System.out.println("high frequency of a character");

    int count=0;
    for(int i=0; i<arr.length; i++)
    {
      if(ch==arr[i])
      {
        count++;
      }
 
    }

    System.out.println(count);

  }
}