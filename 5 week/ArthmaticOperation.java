import java.util.Scanner;
class ArthmaticOperation
{
	
   int a , b ;
	
  void setValue(int x, int y)
  {
    a=x;
    b=y;
  }
  
  void showValue()
  {
	System.out.println("Addition is :"+(a+b));
	System.out.println("Substraction is: "+(a-b));
	System.out.println("Multiplication is: "+(a*b));
	System.out.println("Division is: "+(a/b));
  } 
}

public class ArthmaticMain
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter value for a and b");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	ArthmaticOperation ref=new ArthmaticOperation();
  	ref.setValue(a , b);
	ref.showValue();
 }
}