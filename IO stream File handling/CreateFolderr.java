import java.io.*;
public class CreateFolderr
{
  public static void main(String x[])
  {
     File f=new File("C:\\Users\\hp\\Desktop\\core java practice\\IO stream File handling//Exam");
     boolean b1=f.exists();
    
     if(b1)
     {
       System.out.println("folder is alredy exists");
     }

     else
     {
       boolean b=f.mkdir();
     
     if(b)
     {
       System.out.println("Folder is created");    
     }  

     else
     {
        System.out.println("some problem is there");
     } 
   }
     
  }
}