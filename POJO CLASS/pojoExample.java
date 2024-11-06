import java.util.*;
class Employee
{
  private int id;
  private String name;
  private int sal;

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
  public void setSal(int sal)
  {
    this.sal=sal;
  }
  public int getSal()
  {
    return sal;
  }
  
}

public class pojoExample
{
 public static void main(String arg[])
 {
   Scanner xyz=new Scanner(System.in);

   Employee arr[]=new Employee[5];//Array Declaration

   for(int i=0;i<arr.length;i++)
   {
     arr[i]=new Employee();//Actual Object Creation
     System.out.println("Enter Name \n Enter id \n Enter Sal");
     String n=xyz.nextLine();
     int id=xyz.nextInt();
     int Sal=xyz.nextInt();
     xyz.nextLine();

     arr[i].setName(n);//Employee[[Arya,1,100],[om,2,200],[sham,3,300]]
     arr[i].setId(id);
     arr[i].setSal(Sal);
     
   }

   System.out.println("Data of employee is");
   for(int j=0;j<arr.length;j++)
   {
      System.out.println(arr[j].getId());
      System.out.println(arr[j].getName());
      System.out.println(arr[j].getSal());
   }
 }
}

