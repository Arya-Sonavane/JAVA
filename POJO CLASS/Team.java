import java.util.*;
class Employee
{
  private int id;
  private String name;
  private int runs;

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
  public void setRuns(int runs)
  {
    this.runs=runs;
  }
  public int getRuns()
  {
    return runs;
  }
  
}
class Team1
{
   void addplaer(Employee ...emp)
   {
     System.out.println("!!!!!!!!!!!!!!!!!!!!!");     
     for(int i=0;i<emp.length;i++)
     {
       System.out.println(emp[i].getId());
       System.out.println(emp[i].getName());
       System.out.println(emp[i].getRuns());
     }
   }
}

public class Team
{
 public static void main(String arg[])
 {
   Scanner xyz=new Scanner(System.in);

   Employee arr[]=new Employee[2];//Array Declaration

   for(int i=0;i<arr.length;i++)
   {
     arr[i]=new Employee();//Actual Object Creation
     System.out.println("Enter Name \n Enter id \n Enter Runs");
     String n=xyz.nextLine();
     int id=xyz.nextInt();
     int runs=xyz.nextInt();
     xyz.nextLine();

     arr[i].setName(n);//Employee[[Arya,1,100],[om,2,200],[sham,3,300]]
     arr[i].setId(id);
     arr[i].setRuns(runs);
     
   }
  
    Team1 T=new Team1();
    T.addplaer(arr);
   
 }
}