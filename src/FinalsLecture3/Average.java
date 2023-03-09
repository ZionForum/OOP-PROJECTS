package FinalsLecture3;
public class Average implements Input{
    private double num1, num2, num3, ave;
    @Override
    public void setNum1(double value){
        num1 = value;
    }
    @Override
    public void setNum2(double value){
        num2 = value;
    }
    public void setNum3(double value){
        num3=value;
    }
    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public double getNum3() {
        return num3;
    }
    @Override
    public void compute() {
        ave = num1+num2+num3;
    }
    @Override
    public void display() {
        System.out.println("Average of 3 numbers = " + ave);
    }
}