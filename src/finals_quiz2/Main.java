package finals_quiz2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("## Select employee status ##\n[1]Contractual\t[2]Permanent");
            System.out.print("Input choice: ");
            choice = sc.nextInt();
        }while(choice != 1 && choice != 2);
        if(choice == 1){
            Contractual c = new Contractual();
            System.out.print("Input rate of the employee: ");
            c.setRate(sc.nextDouble());
            System.out.print("Input number of hours worked of the employee: ");
            c.setHours(sc.nextDouble());
            c.computeGross();
            c.computeTax();
            c.computeSSS();
            c.computePagibig();
            c.computePhilhealth();
            c.computeDeductions();
            c.computeNet();
            c.displayAll();
        }
        else{
            Permanent p = new Permanent();
            System.out.print("Input rate of the employee: ");
            p.setRate(sc.nextDouble());
            System.out.print("Input number of hours worked of the employee: ");
            p.setHours(sc.nextDouble());
            p.computeGross();
            p.computeTax();
            p.computeSSS();
            p.computePagibig();
            p.computePhilhealth();
            p.computeDeductions();
            p.computeNet();
            p.displayAll();
        }
    }
}