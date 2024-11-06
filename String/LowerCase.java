//conversion to Lowercase

public class LowerCase
{
  public static void main(String x[])
  {
    String s= "ARYA SONAVANE";
    char arr[]=s.toCharArray();

    for(int i=0; i<arr.length; i++)
    {
       if(arr[i]>='A' && arr[i]<='Z')
       {
          arr[i]=(char)((int)arr[i]+32);
       } 
 
       System.out.println(arr[i]);  
    }
    
  }
}