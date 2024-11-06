
class ArrSum
{
  int arr[];
  
  void setValue(int arr[])
  {
    this.arr=arr;
  }
}
class GetSum extends ArrSum
{
  int getArrSum()
  {
     int sum=0;
    for(int i=0; i<arr.length; i++)
    {
      sum=sum+arr[i];
    }
   return sum;
  }
}

public class ArrSumApp
{
  public static void main(String x[])
  {
    int arr[]=new int[]{10,20,30,40,50};
    
    GetSum a=new GetSum();
    a.setValue(arr);
    int result=a.getArrSum();
    System.out.print(result);
  }
}
