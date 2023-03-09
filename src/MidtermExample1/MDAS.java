package MidtermExample1;
public class MDAS extends Input1{
    private int sum, diff, prod, quo;
    public void Add() {
        sum = super.getNum1() + super.getNum2();
    }
    public void Subtract() {
        diff = super.getNum1() - super.getNum2();
    }
    public void Multiply() {
        prod = super.getNum1() * super.getNum2();
    }
    public void Divide() {
        quo = super.getNum1() / super.getNum2();
    }
    public int getSum() {
        return sum;
    }
    public int getDifference() {
        return diff;
    }
    public int getProduct() {
        return prod;
    }
    public int getQuotient() {
        return quo;
    }
}