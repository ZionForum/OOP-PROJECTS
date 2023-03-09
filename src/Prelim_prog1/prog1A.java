package Prelim_prog1;
import java.util.Scanner;
public class prog1A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //step1: declare an object using the class
        MDAS1 m = new MDAS1();
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
        m.printSum();
        m.printDifference();
        m.printProduct();
        m.printQuotient();
    }
}