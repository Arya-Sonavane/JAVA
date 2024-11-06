class Area
{

  float radius;
  int len;
  int wid;
  void setRadius(float radius)
  {
    this.radius=radius;
  }
  void setLengthWidth(int len,int wid)
  {
     this.len=len;
     this.wid=wid;
  }
}
class Circle extends Area
{
 float getCircleArea()
  {
     return radius*radius*3.14f;
  }

}
class Rectangle extends Area
{
  int getRectangleArea()
  {
    return len*wid;
  }
}

public class AreaApplication
{
  public static void main(String x[])
  {
    Circle a=new Circle();
    a.setRadius(5);
    float c=a.getCircleArea();
    System.out.println(c);

    Rectangle a1=new Rectangle();
    a1.setLengthWidth(3,5);
    int d=a1.getRectangleArea();
    System.out.println(d);
   
  }
}