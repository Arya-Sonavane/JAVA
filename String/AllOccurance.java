//All occurances of a character in a given string

public class AllOccurance
{
  public static void main(String x[])
  {
      String s1="aryaaaaaaaaa";
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