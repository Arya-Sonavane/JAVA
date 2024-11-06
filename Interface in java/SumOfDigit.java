// sum of digits in a string 

public class SumOfDigit
{
  public static void main(String x[])
  {
    String s1="1053123978";
    int sum=0;

    for(int i=0; i<s1.length; i++)
    {
      char ch=s1.charAt(i);

      if(ch>='0' && ch<='9')
      {
        sum=sum+i;

      }
    }
   System.out.println("sum is" +sum);
  }
}