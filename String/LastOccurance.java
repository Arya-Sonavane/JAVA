//1st occurance of a character in a given string

public class LastOccurance
{
  public static void main(String x[])
  {
      String s1="Aryaaaaa";
      char arr[]=s1.toCharArray();
      char ch='a';
     
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]==ch)
        {
          System.out.println(i);
         
        }
        
      }
  }
}