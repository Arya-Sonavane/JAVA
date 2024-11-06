import java.util.Scanner;

public class Cred{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("enter credit score :");
        int XX = scanner.nextInt(); 

        if (XX >= 750) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}