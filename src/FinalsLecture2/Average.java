package FinalsLecture2;
public class Average extends MDAS{
    private int num3, ave;
    public Average(int num1, int num2, int num3) {
        super(num1, num2);
        this.num3 = num3;
    }
    public void setNum3(int value) {
        num3 = value;
    }
    public int getNum3() {
        return num3;
    }
    @Override
    public void compute() {
        ave = (super.getNum1() + super.getNum2() + num3) / 3;
    }
    @Override
    public void display() {
        System.out.println("Average = " + ave);
    }
}