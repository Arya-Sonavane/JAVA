class Value
{

   int no1;
   int no2;
   void setValue(int no1,int no2)
   {
     this.no1=no1;
     this.no2=no2;
   }
}
   
  class Add extends Value
  {
    public int getAdd()
    {
      return no1+no2;
    }
  }

  class Mul extends Value
  {
     public int getMul()
     {
       return no1*no2;
     }
  }

  class Div extends Value
  {
    public int getDiv()
    {
       return no1/no2;
    }
  }

public class InheritanceApplication
{
  public static void main(String arg[])
  {
    Add a=new Add();
    a.setValue(10,20);
    int result=a.getAdd();
    System.out.println(result);
   
    Mul m=new Mul();
    m.setValue(10,20);
    int result1=m.getAdd();
    System.out.println(result1);
   

    Div d=new Div();
    int result2=d.getDiv();
    System.out.println(result2);
    
  System.out.println("result is" +result);
     
  System.out.println("result is" +result1);

     
  System.out.println("result is" +result2);
 
    
  }
}