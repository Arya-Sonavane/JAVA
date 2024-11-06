//Toggle case coversion

public class Toggle
{
  public static void main(String x[])
  {
    String s1="ArYa";
    char arr[]=s1.toCharArray();

    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]>='A' && arr[i]<='Z')
       {
         arr[i]=(char)((int)arr[i]+32);
       } 
       else if(arr[i]>='a'&& arr[i]<='z')
       {
         
        arr[i]=(char)((int)arr[i]-32);
       }
       System.out.println(arr[i]);
    }
    
  }
}