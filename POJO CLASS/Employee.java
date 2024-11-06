import java.util.*;
class Empl
{
  private int id;
  private String name;
  private int run;

  public void setId(int id)
  {
    this.id=id;
  }
  public int getId()
  {
    return id;
  }
  public void setName(String name )
  {
    this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public void setRuns(int sal)
  {
    this.run=run;
  }
  public int getRuns()
  {
    return run;
  }
  
}
class Delete
{
   
   int a=0;
   int count=0;
   void DeleteEntery(int index,Empl arr[])//arr[1,2,3,4,5]
   {
      for(int k=0;k<arr.length;k++)
      {
        count++;
      }

      Empl brr[]=new Empl[count-1];

      for(int i=0;i<arr.length;i++)
      {
        //arr[1,2,3,4,5]
        //index=2
        // The record which are different only they copy into new array i.e brr
        if(arr[i].getId()!=index)
        {
        	brr[a]=arr[i];
           a++;
        }
      }
       

      System.out.println("!!!!!!!!!!!");
      for(int j=0;j<brr.length;j++)
      {
        System.out.println(brr[j].getName());
        System.out.println(brr[j].getId());
        System.out.println(brr[j].getRuns());
      }
     

   }
}
public class Employee
{
 public static void main(String arg[])
 {
   Scanner xyz=new Scanner(System.in);

   Empl arr[]=new Empl[3];//Array Declaration

   for(int i=0;i<arr.length;i++)
   {
     arr[i]=new Empl();//Actual Object Creation
     System.out.println("Enter Name \n Enter id \n Enter Sals");
     String n=xyz.nextLine();
     int id=xyz.nextInt();
     int run=xyz.nextInt();
     xyz.nextLine();

     arr[i].setName(n);//Employee[[Arya,1,100],[om,2,200],[sham,3,300]]
     
     arr[i].setId(id);
     arr[i].setRuns(run);
     
   }
    
    Delete d=new Delete();
    d.DeleteEntery(2,arr);
 }
}