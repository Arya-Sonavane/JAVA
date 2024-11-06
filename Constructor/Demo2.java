

class ABC
{
   
   ABC(int brr[])
   {
     int min=brr[0];

     for(int i=0;i<brr.length;i++)
     {
        if(min>brr[i])
        {
            min=brr[i];
        }
     }
     System.out.println(min);
   }
}
public class Demo2
{
    public static void main(String arg[])
    {
       
       int arr[]=new int[]{10,2,30,40,50};
       ABC ref=new ABC(arr);
    }
}