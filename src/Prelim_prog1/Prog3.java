package Prelim_prog1;
public class Prog3 {
    public static void main(String[] args) {
        //get
        prelimlecture2 m = new prelimlecture2(10, 5);
        //process
        m.Add();
        m.Subtract();
        m.Multiply();
        m.Divide();
        //output
        System.out.println("First Number: " + m.getNum1());
        System.out.println("Second Number: " + m.getNum2());
        System.out.println("Sum: " + m.getSum());
        System.out.println("Difference: " + m.getDiff());
        System.out.println("Product: " + m.getProd());
        System.out.println("Quotient: " + m.getQuo());
    }
}