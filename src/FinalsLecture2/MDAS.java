package FinalsLecture2;
public class MDAS extends Input{
    private int sum, diff, prod, quo;
    public MDAS(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    public void compute() {
        sum=getNum1() + getNum2();
        diff=getNum1() - getNum2();
        prod=getNum1() * getNum2();
        quo=getNum1() / getNum2();
    }
    @Override
    public void display() {
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quo);
    }
}