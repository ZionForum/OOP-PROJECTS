package MidtermExample2;
import java.util.Scanner;
public class Example2Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //step1: declare an object using the class
        Average m = new Average();
        //input
        System.out.print("Enter number: ");
        m.setNum1(s.nextInt());
        System.out.print("Enter number: ");
        m.setNum2(s.nextInt());
        System.out.print("Enter number: ");
        m.setNum3(s.nextInt());
        //process
        m.Add();
        m.Subtract();
        m.Multiply();
        m.Divide();
        m.computeAverage();
        //output
        System.out.println("Sum of first and second number:" + m.getSum());
        System.out.println("Difference of first and second number:" + m.getDifference());
        System.out.println("Product of first and second number:" + m.getProduct());
        System.out.println("Quotient of first and second number:" + m.getQuotient());
        System.out.println("Average of the 3 numbers:" + m.getAverage());
    }
}