//find lowest frequency in a string without using inbuilt function

public class LowestFrequency
{
  public static void main(String x[])
  {
    String s1="aryaaaaaaaa";
    char arr[]=s1.toCharArray();
    char ch='a';

    System.out.println("lowest frequency of a character is");

    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]==1)
      {
        char temp=(char) (i+'a');
        
      }
     System.out.println(temp);
    }
   }
}
    
    