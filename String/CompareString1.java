//program to compare two string 

public class CompareString
{
   public static void main(String x[])
   {
     String s1="Arya";
     String s2="Arya";

     
     if(s1.length()==s2.length())
     {
       boolean flag=false;
       for(int i=0;i<s1.length();i++)
       {
          if(s1.charAt(i)!=s2.charAt(i))
          {
             flag=true;
             break;
          }
       }
       if(flag)
       {
          System.out.println("No !");
       }
      else
       {
          System.out.println("Yes !");
       }

     }
	 else
     {
          System.out.println("String length are not same!");   
     }
   }
}