package MidtermExample3;
import java.util.Scanner;
public class Example3Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MDAS m = new MDAS();
        Average a = new Average();
        int choice = 0;
        do{
            System.out.println("[1] MDAS of 2 numbers\n[2] Average of 3 numbers");
            System.out.print("Input Choice: ");
            choice = s.nextInt();
        }
        while(choice < 1 || choice > 2);
        if(choice == 1) {
            System.out.print("Enter number: ");
            m.setNum1(s.nextInt());
            System.out.print("Enter number: ");
            m.setNum2(s.nextInt());
            //process
            m.Add();
            m.Subtract();
            m.Multiply();
            m.Divide();
            //output
            System.out.println("Sum:" + m.getSum());
            System.out.println("Difference:" + m.getDifference());
            System.out.println("Product:" + m.getProduct());
            System.out.println("Quotient:" + m.getQuotient());
        }
        else{
            System.out.print("Enter number: ");
            a.setNum1(s.nextInt());
            System.out.print("Enter number: ");
            a.setNum2(s.nextInt());
            System.out.print("Enter number: ");
            a.setNum3(s.nextInt());
            a.computeAverage();
            System.out.println("Average: " + a.getAverage());
        }
    }
}