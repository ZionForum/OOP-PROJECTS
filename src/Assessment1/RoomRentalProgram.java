package Assessment1;
import java.util.Scanner;
public class RoomRentalProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Declaration of data types into variables
        int n;
        double nc, rs, tele, misc, rc, ac, subttl, tax=33.70, tc;
        char op;
        // Inputs
        do {
        System.out.println("Room Information");
        System.out.print("Nights: ");
        n = s.nextInt();
        System.out.print("Nightly Charge: ");
        nc = (double) s.nextDouble();
        System.out.println("\nAdditional Charges");
        System.out.print("Room Services: ");
        rs = (double) s.nextDouble();
        System.out.print("Telephone: ");
        tele = (double) s.nextDouble();
        System.out.print("Misc.: ");
        misc = (double) s.nextDouble();
        // Process
        rc = n * nc;
        ac = rs + tele + misc;
        subttl = rc + ac;
        tc = subttl + tax;
        // Outputs
        System.out.println("\nTotal Charges");
        System.out.println("Room Charges: $" + rc);
        System.out.println("Additional Charges: $" + ac);
        System.out.println("Subtotal: $" + subttl);
        System.out.println("Tax: $" + tax);
        System.out.println("Total Charges: $" + tc);
        System.out.println("\nCompute again? [Y/N]: ");
        op = s.next().charAt(0);
        }
        while(op=='Y' || op=='y');
    }
}