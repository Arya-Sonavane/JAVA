//total number of vowels and consonants character

public class VowelConsonant
{
  public static void main(String x[])
  {
    String s1="aryasonvane";

    char arr[]=s1.toCharArray();
    int count=0;
    int count1=0;
    

    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u')
      {
       count++;
      }
      else 
      {
        count1++;
      }
    
    }
    System.out.println("number of vowels"+count);
    System.out.println("number of consonants"+count1);
   
  }
}