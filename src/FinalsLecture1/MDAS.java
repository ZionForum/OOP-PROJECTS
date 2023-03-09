package FinalsLecture1;
public class MDAS {
    private int num1, num2, sum, diff, prod, quo;
    public MDAS(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void setNum1(int value) {
        num1 = value;
    }
    public void setNum2(int value) {
        num2 = value;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public void compute() {
        sum=num1+num2;
        diff=num1-num2;
        prod=num1*num2;
        quo=num1/num2;
    }
    public void display() {
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quo);
    }
}