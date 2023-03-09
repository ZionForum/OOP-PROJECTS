package midtermExam;
import java.util.Scanner;
public class midExam {
    public static void main(String[] args) {
        //Scanner class
        Scanner s = new Scanner(System.in);
        Computation c = new Computation();
        //Declaration of data types into variables and initializing zero values
        int choice = 0;
        //inputs
        System.out.print("Employee's rate: ");
        c.setRate(s.nextDouble());
        System.out.print("Number of hours worked: ");
        c.setHoursWork(s.nextInt());
        //Iteration and Conditional Statement
        do{
            System.out.print("[1]Regular Employee\n[2]Contractual\nInput choice: ");
            choice = s.nextInt();
        }while (choice != 1 && choice != 2);
        c.setStatus(choice);
        //Process
        c.cmptGross();
        c.cmptTax();
        c.cmptSSS();
        c.cmptPhHealth();
        c.cmptPagibig();
        c.cmptTtlDeduct();
        c.cmptNetSalary();
        c.cmptBonus();
        c.cmptTtlSalary();
        c.display();
    }
}