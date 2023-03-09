package Finals_Quiz1_Test2;
import java.util.Scanner;
public class FinalsQ1P2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("[1]Area and Perimeter of triangle: ");
            System.out.println("[2]Sine, Cosine, and Tangent of triangle: ");
            System.out.print("Input choice: ");
            choice = sc.nextInt();
        }while (choice != 1 && choice != 2);
        if(choice==1)
        {
            AreaPerimeter ap = new AreaPerimeter();
            System.out.print("Enter Number [A]: ");
            ap.setA(sc.nextInt());
            System.out.print("Enter Number [B]: ");
            ap.setB(sc.nextInt());
            System.out.print("Enter Number [C]: ");
            ap.setC(sc.nextInt());
            System.out.print("Enter Number [Height]: ");
            ap.setHeight(sc.nextInt());
            ap.compute();
            ap.display();
        }
        else
        {
            SOHCAHTOA s = new SOHCAHTOA();
            System.out.print("Enter Number [A]: ");
            s.setA(sc.nextInt());
            System.out.print("Enter Number [B]: ");
            s.setB(sc.nextInt());
            System.out.print("Enter Number [C]: ");
            s.setC(sc.nextInt());
            s.compute();
            s.display();
        }
    }
}