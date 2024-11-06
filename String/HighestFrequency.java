//find highest frquency of of a character in a given string 

public class HighestFrequency
{
  public static void main(String x[])
  {
   String s1="aryaaaaaa";
   char arr[]=s1.toCharArray();

   for(int i=0; i<a.length; i++)
   {
      freq[i]=1;

      for(int j=i+1; j<arr.length; j++)
      {
         if(arr[i]==arr[j]);
         {
          freq[i]++;

          arr[j]='0';
         }
      }
   }
    for(int i=0; i<freq.length; i++)
    {
      System.out.println(arr[i]);
    }
     
  }
}