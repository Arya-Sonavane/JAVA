//conversion to uppercase

public class Uppercase
{
  public static void main(String x[])
  {
    String s= "arya sonavane";
    char arr[]=s.toCharArray();

    for(int i=0; i<arr.length; i++)
    {
       if(arr[i]>='a' && arr[i]<='z')
       {
          arr[i]=(char)((int)arr[i]-32);
       } 
 
       System.out.println(arr[i]);  
    }
    
  }
}