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
  
   void calBill(Prod p)
   {
     System.out.println(p.getName());
   }

}
public class NewPojo
{
  public static void main(String arg[])
 { 
   Prod p=new Prod();
   p.setId(1);
   p.setName("Parle");
   p.setQty(10);
   p.setRate(5);

   

   CalculateBill b=new CalculateBill();
   b.calBill(p);

 }
} 