//1st occurance of a character in a given string

public class FirstOccurance
{
  public static void main(String x[])
  {
      String s1="Arya";
      char arr[]=s1.toCharArray();
      char ch='r';
     
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]==ch)
        {
          System.out.println(i);
          break;
        }
        
      }
  }
}
