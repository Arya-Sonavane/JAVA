class Prod
{
  private int id;
  private String name;
  private int qty;
  private int rate;
  
  public void setId(int id)
  {
    this.id=id;
  }
  public int getId()
  {
     return id;
  }
  public void setName(String name)
  {
     this.name=name;
    
  }
  public String getName()
  {
     return name;
  }
  public void setQty(int qty)
  {
     this.qty=qty;
  }
  public int getQty()
  {
     return qty;
  }
  public void setRate(int rate)
  {
    this.rate=rate;
  }
  public int getRate()
  {
    return rate;
  } 
}

class CalculateBill
{
   int answer=0;
   void calBill(Prod ...p)
   {
     for(int i=0;i<p.length;i++)
     {
       int result=p[i].getQty()*p[i].getRate();
       System.out.println(result);
       answer=answer+result;
     }
     System.out.println("The Final Summation of Total Bill Is "+answer);
   }

}
public class Product
{
  public static void main(String arg[])
 { 
   Prod p=new Prod();
   p.setId(1);
   p.setName("Parle");
   p.setQty(10);
   p.setRate(5);

   Prod p1=new Prod();
   p1.setId(2);
   p1.setName("Cadbury");
   p1.setQty(10);
   p1.setRate(10);

   Prod p2=new Prod();
   p2.setId(3);
   p2.setName("Britania");
   p2.setQty(10);
   p2.setRate(10);

   CalculateBill b=new CalculateBill();
   b.calBill(p,p1,p2);

 }
} 