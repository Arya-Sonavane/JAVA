//count all occurances of a character in a given string

public class CountOccurance
{
  public static void main(String x[])
  {
      String s1="aryaaaaaaaaa";
      char arr[]=s1.toCharArray();
      char ch='a';
      int count=0;
      
     
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]==ch)
        {
         count++; 
         
        }
     
      }

      System.out.println(count);
  }
}