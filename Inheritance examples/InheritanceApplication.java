class Value
{

   int no1; //Inheritance menas transfer data from parant to child.
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
    a.setValue(20,10);
    int b=a.getAdd();      //if function return type is int store the value in (int b) variable
    System.out.println(b);

    Mul a1=new Mul();
    a1.setValue(20,10);
    int b1=a1.getMul();    //function return type is int 
    System.out.println(b1);

    Div a2=new Div();
    a2.setValue(20,10);
    int b2=a2.getDiv();   //function return type is int
    System.out.println(b2);
   
 
    
  }
}