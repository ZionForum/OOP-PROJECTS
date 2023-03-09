package Prelim_prog1;
public class prelimlecture2 {
    private int num1, num2, sum, diff, prod, quo;
    //constructor of the class
    public prelimlecture2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //process
    public void Add() {
        sum=num1+num2;
    }
    public void Subtract() {
        diff=num1-num2;
    }
    public void Multiply() {
        prod=num1*num2;
    }
    public void Divide() {
        quo=num1/num2;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public int getSum() {
        return sum;
    }
    public int getDiff() {
        return diff;
    }
    public int getProd() {
        return prod;
    }
    public int getQuo() {
        return quo;
    }
}