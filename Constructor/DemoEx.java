//Utility class and Singlton class


//Utility class-:Utility class is noting but when we dont want to cerate object of perticular class.
//Static method and variable only class by class name.
// class ABC
// {
//     static int a=10;
//     static int b=20;
//     private ABC()
//     {
//        //private con.
//     }
//     static void show()
//     {
//         System.out.println(a);
//         System.out.println(b);
//     } 
// }
// class DemoEx
// {
//     public static void main(String arg[])
//     {
//         ABC.show();
//     }
// }


//Singlton class-:Singlton class is class we can create only one object.
class ABC
{
   private static ABC ref;
   private ABC()
   {
     System.out.println("In Constructor");
   }
   public static ABC getIstance()
   {
      if(ref==null)
      {
         ref=new ABC();
      }
      return ref;
   }

}
class DemoEx
{
    public static void main(String arg[])
    {
       ABC a=ABC.getIstance();
       ABC b=ABC.getIstance();

    }
}