//total number of digits alphabets and or special character

public class DigitCharacter
{
  public static void main(String x[])
  {
    String s1="aryaaaa@@@@@332133213321";

    char arr[]=s1.toCharArray();

    int count=0;
    int count1=0;
    int count2=0;

    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z')
      {
       count++; 
      }
      else if(arr[i]>='0' && arr[i]<='9')
      {
        count1++;
      }
      else
      {
        count2++;
      }
    
    }
    System.out.println("number of alphabets"+count);
    System.out.println("number of digits"+count1);
    System.out.println("number of special characters"+count2);
  }
}