// reverse words

public class ReverseWords
{
  public static void main(String x[])
  {
     String s1="Arya Sonavane";
     char arr[]=s1.toCharArray();

     int mid=arr.length/2;
     for(int i=0; i<mid; i++)
     {
          char temp=arr[i];
          arr[i]=arr[arr.length-i-1];
          arr[arr.length-i-1]=temp;
     }
     System.out.println("reverse order of words");

     for(int i=0; i<arr.length; i++)
     {
         System.out.println(arr[i]);
     }
  }
}