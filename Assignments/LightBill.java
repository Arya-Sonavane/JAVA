import java.util.Scanner;
public class LightBill
{
	public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);

        System.out.print("Enter the total units of electricity consumed: ");
        int units = input.nextInt();

        double bill = 0;

        if (units <= 50)
	 {
             bill = units * 0.50;
         } 
	else if (units <= 150) 
	{
            bill = 25+ (units - 50) * 0.75;
        } 
	else if (units <= 250)
	{
            bill = 100+ (units - 150) * 1.20;
        }
	 else {
            bill = 220+ (units - 250) * 1.50;
        }

      		  double surcharge = bill * 0.20;
       		  double totalBill = bill + surcharge;

        System.out.println("Electricity Bill: Rs. " + bill);
        System.out.println("Surcharge Amount: Rs. " + surcharge);
        System.out.println("Total Bill (including surcharge): Rs. " + totalBill);

	}
}