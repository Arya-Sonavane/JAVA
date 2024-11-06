//Q10 total number of words in a string

public class WordInString
{
  public static void main(String x[])
  {
    String s1="Simplicity is the classiest Grace";
    char arr[]=s1.toCharArray();
    int count=1;
   

    for(int i=0; i<arr.length; i++)
    {
       if(arr[i]==' ')
       {
         count++;
       }
    } 
   
   System.out.println("no of words " +count);
 
  }
}