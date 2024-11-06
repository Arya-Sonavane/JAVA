import java.util.Scanner;
public class Monkey
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Monkey:");
		int No=sc.nextInt();
		
		System.out.println("enter eatable bananas and peanuts");
		int k=sc.nextInt();
		int j =	sc.nextInt();
		
		System.out.println("enter total bananas and peanuts");
		int m=sc.nextInt();
		int p=sc.nextInt();
	
		int banana=m/k;
		int peanuts=p/j;
		
		int total=banana+peanuts;
		int RM=No-total;
		System.out.println("Number of Monkeys left on the tree: "+RM);
		
	}
}