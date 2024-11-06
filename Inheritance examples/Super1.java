class PersonalInfo
{  String n;
   String m;
   String l;
  PersonalInfo(String name, String middlename, String lastname)
  {
    n=name;
    m=middlename;
    l=lastname; 
  }
}
class ProfessionalInfo extends PersonalInfo
{
   ProfessionalInfo(int id,String des,int salary,String skillset)
   {
      super("Arya","Pune","rio");
      System.out.println("id");
      System.out.println("des");
      System.out.println("salary");
      System.out.println("skillset");
      System.out.println("n");
      System.out.println("m");
      System.out.println("l");
    
     }
}
public class Super1
{
    public static void main(String arg[])
    {
       ProfessionalInfo  p = new ProfessionalInfo(1,"aa",100,"cpp");
      
    }
}