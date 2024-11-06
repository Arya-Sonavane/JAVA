//check wheather a string is palindrome or not



public class Palindrome
{
  public static void main(String x[])
  {
     String s1="141";
     char arr[]=s1.toCharArray();

     String result="";
     
 
     for(int i=arr.length-1; i>=0; i--)
     {
       result=result+arr[i];
     }
    System.out.println(result);
  }
}



































