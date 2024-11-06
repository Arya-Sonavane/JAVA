public class PrintAlphabate
{
	public static void main(String args[])
	{
		char s='a'; 
		char p ='z';
		
		while(s<=p)
		{
			System.out.printf("%c\t",s);
			s++;
		}
	}
}