Constructor-:It is special function whoes name same like AS class name having no retrun type.
1)The main task of inheritance to initialize instance varaibles.
2)Note-://! Constructor are not used for object creation.
2)Constructor call when we create object of class.
3)modifiers allowed with constructor are-:
   1)public  2)protected  3)private  4)default

4)Note//! Final ,Sunchronized modifiers are not use with constructor.
5)In java when we deont specify any constructor then compiler add one constructor named ad //! default Constructor
 Note-://!Compiler is responsible to add Default constructor not JVM.
6)If we add oue own default constructor then compiler not add default constructor.
7)use javap command to see default constructor.
8)//! Note-:Access modifier of default constructor os same as class modifier.
9)default constructor contaion only one line i.e no-arg call to super constructor.
10)With the help of private constructor we can create utility class(class whoes object we cant create) and singlton class(class for we can create only one object).
11)In java there are two types of constructor 
    1)default
      ex-:
      class ABC
      {
          ABC() //! default Constructor.
          {
      
          }
      }

    2)Parametrised
    ex-:
    class ABC
    {
        ABC(int a) //! parametrised Constructor.
        {
    
        }
    }
12)The super and this contain first line of constructor.
13)Outside constructor we cant specify super() and this().
14)this()-:refers to currwnt class  constructor
15)super()-:refers to parent class constructor 
16)super and this keywords are diffrent from super() and this() they refer to methods and can be declared outside  constructor.

*/


//! Constructor Example without inheritance.

1)Default Constructor.

class ABC
{
    ABC()
    {
        System.out.println("Default cons.");
    }
}
public class Constructor
{
    public static void main(String arg[])
    {
        ABC ref=new ABC();
    }
}


1)Parametrised Constructor.

class ABC
{
    ABC(int a)
    {
        System.out.println(a);
    }
}
public class Constructor
{
    public static void main(String arg[])
    {
        ABC ref=new ABC(10);//parametrised constructor.
    }
}


//! Constructor Example with inheritance.

1)Default Constructor.

class ABC
{
    ABC()
    {
        System.out.println("Default cons.");
    }
}
class PQR extends ABC
{
    PQR()
    {
        ystem.out.println("Default cons. of PQR");
    }
}
public class Constructor
{
    public static void main(String arg[])
    {
        PQR ref=new PQR();
    }
}


1)Parametrised Constructor.

class ABC
{
    ABC(int a)
    {
        System.out.println(a);
    }
}
class PQR extends ABC
{
    PQR()
    {
        super(10);

    }
}
public class Constructor
{
    public static void main(String arg[])
    {
        PQR b=new PQR();
    }
}

//!In case of constructor inheritance and orriding is not allowed