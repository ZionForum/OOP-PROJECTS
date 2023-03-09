package MidtermExample1;
import java.util.Scanner;
public class Example1Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //step1: declare an object using the class
        MDAS m = new MDAS();
        //input
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
}