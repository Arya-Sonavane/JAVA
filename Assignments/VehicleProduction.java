import java.util.Scanner;

public class VehicleProduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.println("Enter the total number of vehicles:");
        int V = input.nextInt();

      
        System.out.println("Enter the total number of wheels:");
        int W = input.nextInt();

       
        if (W % 2 != 0 || W < 2 || V >= W) {
            System.out.println("INVALID INPUT");
        } else {
          
            int FW = (W - (2 * V)) / 2;
            int TW = V - FW;

           
            System.out.println("TW = " + TW + " FW = " + FW);
        }

      }
}
