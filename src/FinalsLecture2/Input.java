package FinalsLecture2;
public abstract class Input {
    private int num1, num2;
    public Input(int num1, int num2) {
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
    public abstract void compute();
    public abstract void display();
}