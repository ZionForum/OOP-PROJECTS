package FinalsLecture3;
public class MDAS implements Input{
    private double num1, num2, num3, sum, diff, prod, quo;
    @Override
    public void setNum1(double value){
        num1=value;
    }
    public void setNum2(double value){
        num2=value;
    }
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    @Override
    public void compute(){
        sum=num1+num2;
        diff=num1-num2;
        prod=num1*num2;
        quo=num1/num2;
    }
    @Override
    public void display() {
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quo);
    }
}
