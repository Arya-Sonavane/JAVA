import java.util.Scanner;
public class Str
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter value");
  String str=sc.next();

  int cnt=0;
  char [] chars=str.toCharArray();
   
   for(char ch:chars)
   {
	if(ch=='\0')
        {
	  break;
	}
	cnt++;
   }
 
 System.out.println(cnt);
}
}
  